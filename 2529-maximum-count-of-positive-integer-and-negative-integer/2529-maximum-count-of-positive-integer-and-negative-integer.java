class Solution {
    public int maximumCount(int[] nums) {
        int positiveCount=0;
        int negativeCount=0;
        for(int val:nums){
            if(val==0){
                continue;
            }
            if(val>0){
                positiveCount++;
            }
            else{
                negativeCount++;
            }
        }
        int ans=0;
        if(positiveCount>= negativeCount){
            ans=positiveCount;
        }
        else{
            ans=negativeCount;
        }
        return ans;
    }
}