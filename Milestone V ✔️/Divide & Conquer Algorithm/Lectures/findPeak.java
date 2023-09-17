class Solution {
    public static int findPeak(int[] arr, int l, int h, int n) {
        int m = (l + h) / 2;
        
        if ((m == 0 || arr[m] >= arr[m - 1]) && (m == n - 1 || arr[m] >= arr[m + 1])) {
            return m;
        } else if (m > 0 && arr[m - 1] > arr[m]) {
            return findPeak(arr, l, m - 1, n);
        } else {
            return findPeak(arr, m + 1, h, n);
        }
    }

    public int peakElement(int[] arr, int n) {
        return findPeak(arr, 0, n - 1, n);
    }
}
