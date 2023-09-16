// Q.4. Median of Two Sorted Arrays

public class Median {

    static double findMedianSortedArrays(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;

        if (m > n) { // Ensure arr1 is the smaller array
            return findMedianSortedArrays(arr2, arr1);
        }

        int low = 0, high = m;

        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = (m + n + 1) / 2 - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1];
            int right1 = (cut1 == m) ? Integer.MAX_VALUE : arr1[cut1];
            int right2 = (cut2 == n) ? Integer.MAX_VALUE : arr2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                if ((m + n) % 2 == 0) { // Even length
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else { // Odd length
                    return Math.max(left1, left2);
                }
            } else if (left1 > right2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }

    public static void main(String[] args) {
        int arr1[] = {1, 4, 7, 10, 12};
        int arr2[] = {2, 3, 6, 15};

        double median = findMedianSortedArrays(arr1, arr2);

        System.out.println("The median of two sorted arrays is: " + median);
    }
}
