class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=accounts.length;
        int n=accounts[0].length;
        int overAllMax=Integer.MIN_VALUE;
        for(int i=0; i<m; i++){
            int max=0;
            for(int j=0; j<n; j++){
                max+=accounts[i][j];
            }
            if(max>overAllMax){
                overAllMax=max;
            }
        }
        return overAllMax;

    }
}