public class DistributeCandies {
    public static int candy(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        
        // Left to right
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            }
        }
        
        // Right to left with a fix
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                dp[i] = Math.max(dp[i], dp[i + 1] + 1); // Use Math.max to prevent reducing the value
            }
        }
        
        for (int i = 0; i < n; i++) {
            total += dp[i];
        }
        
        return total;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,1};
        System.out.println(candy(arr));
    }
}
    
