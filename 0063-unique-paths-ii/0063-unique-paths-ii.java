class Solution {

    static int solve(int row, int col, int m, int n, int[][] obstacleGrid, int[][] dp) {

        // Outside the grid
        if (row >= m || col >= n) {
            return 0;
        }

        // Obstacle
        if (obstacleGrid[row][col] == 1) {
            return 0;
        }

        // Reached destination
        if (row == m - 1 && col == n - 1) {
            return 1;
        }

        if(dp[row][col]!=-1){
            return dp[row][col];
        }

        // Move down
        int down = solve(row + 1, col, m, n, obstacleGrid, dp);

        // Move right
        int right = solve(row, col + 1, m, n, obstacleGrid, dp);
        dp[row][col]=down+right;
        return dp[row][col];
        // return down + right;
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row=0;
        int col=0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }

        return solve(row, col, m, n, obstacleGrid, dp);
    }
}