class Solution {
    public int minMoves(int[] nums) {
        int getMax=Integer.MIN_VALUE;
        int operationCount=0;
        for(int val:nums){
            if(val>getMax){
                getMax=val;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]<getMax){
                int value=nums[i];
                while(value<getMax){
                    operationCount++;
                    value++;
                }
            }
        }
        return operationCount;
    }
}