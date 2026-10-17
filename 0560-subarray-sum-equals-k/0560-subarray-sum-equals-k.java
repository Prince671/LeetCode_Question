class Solution {
    public int subarraySum(int[] nums, int k) {
        int start=0;
        int count=0;
        while(start<nums.length){
            int windowSum=0;
            for(int i=start; i<nums.length; i++){
                windowSum+=nums[i];

                if(windowSum==k){
                    count++;
                    // break;
                }
            }
            start++;
        }

        return count;
    }
}