public class MCM {
    public static int matrixChainOrder(int[] p, int n) {
        int[][] m = new int[n][n];

        for (int i = 1; i < n; i++) {
            m[i][i] = 0;
        }

        for (int l = 2; l < n; l++) {
            for (int i = 1; i < n - l + 1; i++) {
                int j = i + l - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < m[i][j]) {
                        m[i][j] = q;
                    }
                }
            }
        }

        return m[1][n - 1];
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4 };
        int n = arr.length;
        System.out.println("Number of scalar multiplications: " + matrixChainOrder(arr, n));
    }
}
