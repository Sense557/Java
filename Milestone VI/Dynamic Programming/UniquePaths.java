class Solution {
   public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n]; // Create a 2D array to store intermediate results
       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 1; // Initialize the first row and first column to 1
                else
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1]; // Calculate unique paths
            }
        }
       
        return dp[m - 1][n - 1]; // Return the result for the last cell
    }
}
