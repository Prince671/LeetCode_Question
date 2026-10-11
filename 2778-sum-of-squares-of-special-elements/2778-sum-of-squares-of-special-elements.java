class Solution {
    public int sumOfSquares(int[] nums) {
        int sqSum=0; 
        int n=nums.length;

        for(int i=0; i<n; i++){
            if(n%(i+1)==0){
                sqSum+=nums[i]*nums[i];
            }
        }
        return sqSum;
    }
}