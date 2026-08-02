class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=0;
        int finalMaxCount=0;
        int count=0; 
        for(int i=0; i<nums.length; i++){
            
            if(nums[i]==1){
                count++;
                maxCount=count;
            }
            else{
                finalMaxCount=Math.max(maxCount, finalMaxCount);
                count=0;
                maxCount=0;
            }
            finalMaxCount=Math.max(maxCount, finalMaxCount);
        }
        return finalMaxCount;
    }
}