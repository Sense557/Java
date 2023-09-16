public class MaximumSubArray {

    // Find the maximum possible sum in arr[]
    // such that arr[m] is part of it

    static int maxCrossingSum(int arr[], int l, int m, int h) {

        // include elements on left of mid
        int sum = 0;
        int left_sum = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            sum = sum + arr[i];
            if (sum > left_sum)
                left_sum = sum;
        }

        // include elements on right of mid
        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for (int i = m; i <= h; i++) {
            sum = sum + arr[i];
            if (sum > right_sum)
                right_sum = sum;
        }
        // Return sum of elements on left
        // and right of mid
        // returning only left_sum + right_sum fail for
        // [-2, 1]
        return Math.max(left_sum, right_sum);
    }

    // Returns sum of maximum sum subarray
    // in arr[l....h]

    static int maxSubarraySum(int arr[], int l, int h) {
        // Invalid range: low is greater than high
        if (l > h)
            return Integer.MIN_VALUE;

        // base case: only one element
        if (l == h)
            return arr[l];

        // Find middle point
        int m = (l + h) / 2;

        /*
         * Return maximum of following three possible cases a) - max subarray sum in left
         * half(L to mid-1) b) - max subarray sum in the right half (mid + 1 to h) c) - max
         * subarray sum such that subarray crosses the mid point - combined sum
         */

        return Math.max(
                Math.max(maxSubarraySum(arr, l, m - 1), maxSubarraySum(arr, m + 1, h)),
                maxCrossingSum(arr, l, m, h));
    }

    // time complexity = O(nlogn)

    // Driver program to find the max subarray sum
    public static void main(String[] args) {
        int arr[] = { 5, -2, 1, -3, 4, -2, 1 };
        int n = arr.length;
        int max_sum = maxSubarraySum(arr, 0, n - 1);
        System.out.println("maximum contiguous sum is " + max_sum);
    }
}
