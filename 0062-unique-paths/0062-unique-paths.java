class Solution {
    static int getUniquePath(int arr[][], int i, int j, int dp[][]){
        int m=arr.length;
        int n=arr[0].length;
        
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>=m || j>=n){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int down=getUniquePath(arr, i+1, j, dp);
        int right=getUniquePath(arr, i, j+1, dp);

        int finalAns=down+right;
        dp[i][j]=finalAns;
        return finalAns;
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
        }
        int arr[][]=new int[m][n];
        return getUniquePath(arr, 0, 0, dp);

        
    }
}