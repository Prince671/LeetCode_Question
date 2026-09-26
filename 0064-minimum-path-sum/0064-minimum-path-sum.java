class Solution {
    static int getMinSum(int row, int col, int m, int n, int[][] grid, int[][] dp){
        if(row>=m||col>=n){
            return Integer.MAX_VALUE;
        }
        if(row==m-1 && col==n-1){
            return grid[row][col];
        }
        if(dp[row][col]!=-1){
            return dp[row][col]; 
        }
        int mini=Integer.MAX_VALUE;
        int down=getMinSum(row+1, col, m, n, grid, dp);
        int right=getMinSum(row, col+1, m, n, grid, dp);
        mini=grid[row][col]+Math.min(down, right);

        dp[row][col]=mini;

        return dp[row][col];
    }
    public int minPathSum(int[][] grid) {
        int row=0;
        int col=0;
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }
        return getMinSum(row, col, m, n, grid, dp);
    }
}