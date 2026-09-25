class Solution {
    static int solve(int row, int col, int m, int n, int[][] dp){
        if(row==m-1 || col==n-1){
            return 1;
        }
        if(row>=m || col>=n){
            return 0;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int down=solve(row+1, col, m, n, dp);
        int right=solve(row, col+1, m, n, dp);
        dp[row][col]=right+down;
        return dp[row][col];
    }
    public int uniquePaths(int m, int n) {
        int col=0;
        int row=0;
        int[][] dp=new int[m][n];
         for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }


        return solve(row, col, m, n, dp);
    }
}