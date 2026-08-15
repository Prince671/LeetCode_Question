class Solution {
    public int diagonalSum(int[][] mat) {

        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            // Primary diagonal
            sum += mat[i][i];

            // Secondary diagonal
            sum += mat[i][n - 1 - i];
        }

        // Middle element was counted twice for odd-sized matrix
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}