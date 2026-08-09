class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int mergeAdd[]=new int[n*m];
        int k=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mergeAdd[k]=grid[i][j];
                k++;
            }
            
        }
        Arrays.sort(mergeAdd);
        int ans[]=new int[2];
        Set<Integer> st=new HashSet<>();
        int j=0;
        for(int i=0; i<mergeAdd.length; i++){
            if(!st.contains(mergeAdd[i])){
                st.add(mergeAdd[i]);
            }else{
                if(j<ans.length){
                ans[j]=mergeAdd[i];
                j++;}
            }
            
        }
        boolean isFound=false;
        for(int i=0; i<mergeAdd.length; i++){
            isFound=false;
            for(int x:mergeAdd){
                if(x==i+1){
                    isFound=true;
                }
                
            }
            if(!isFound){
                    ans[j]=i+1;
                }
        }
        return ans;
    }
}