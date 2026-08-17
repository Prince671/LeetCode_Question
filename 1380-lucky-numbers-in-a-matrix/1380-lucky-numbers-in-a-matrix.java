class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        
        for(int i=0; i<matrix.length; i++){
            int min=Integer.MAX_VALUE;
            int colNo=-1;
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    colNo=j;
                }
            }
            boolean isLucky=true;
            for(int x=0; x<matrix.length; x++){
                if(matrix[x][colNo]>min){
                    isLucky=false;
                    break;
                }
            }
            if(isLucky){
                ans.add(min);
            }
        }
        return ans;
    }
}