class Solution {
    static int getMinSum(List<List<Integer>> triangle, int rowIndex, int colIndex, Integer[][] dp){
        if(rowIndex==triangle.size()-1){
            return triangle.get(rowIndex).get(colIndex);
        }

        if(dp[rowIndex][colIndex]!=null){
            return dp[rowIndex][colIndex];
        }

        int down=getMinSum(triangle, rowIndex+1, colIndex, dp);
        int diagonal=getMinSum(triangle, rowIndex+1, colIndex+1, dp); //moving in i+1 direction from i
        int finalAns=triangle.get(rowIndex).get(colIndex)+Math.min(down, diagonal);

        dp[rowIndex][colIndex]=finalAns;
        
        return dp[rowIndex][colIndex];
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int rowIndex=0;
        int colIndex=0;
        Integer[][] dp = new Integer[triangle.size()][triangle.size()];

        return getMinSum(triangle, rowIndex, colIndex, dp);
    }
}