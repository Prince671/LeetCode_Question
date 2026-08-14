class Solution {
    public int alternatingSum(int[] nums) {
        int n=nums.length;
        int evenIndicesSum=0;
        int oddIndicesSum=0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                evenIndicesSum+=nums[i];
            }else{
                oddIndicesSum+=nums[i];
            }
        }
        return evenIndicesSum-oddIndicesSum;
    }
}