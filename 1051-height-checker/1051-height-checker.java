class Solution {
    public int heightChecker(int[] heights) {
        int sortedArr[]=new int[heights.length];
        int index=0;
        for(int val:heights){
            sortedArr[index]=val;
            index++;
        }
        Arrays.sort(sortedArr);
        int count=0;
        int i=0; 
        int j=0;
        while(i<sortedArr.length && j<heights.length){
            if(sortedArr[i]!=heights[j]){
                count++;
            }
            i++;
            j++;            
        }
        return count;
    }
}