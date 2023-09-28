class Solution {
    public static int maximumPath(int N, int[][] M) {
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j == 0) { // 1st Column
                    M[i][j] += Math.max(M[i - 1][j], M[i - 1][j + 1]);
                } else if (j == N - 1) { // Last Column
                    M[i][j] += Math.max(M[i - 1][j - 1], M[i - 1][j]);
                } else {
                    M[i][j] += Math.max(M[i - 1][j - 1], Math.max(M[i - 1][j], M[i - 1][j + 1]));
                }
            }
        }

        // Find the maximum from the Last Row
        int ans = 0;
        for (int j = 0; j < N; j++) {
            ans = Math.max(ans, M[N - 1][j]);
        }
        return ans;
    }
}
