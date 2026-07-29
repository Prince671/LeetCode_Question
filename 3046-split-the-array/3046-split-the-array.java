class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int count=0; 
        for(int val:nums){
            count=0;
            for(int val2:nums){
                if(val==val2){
                    count++;
                }
            }
            if(count>2){
                return false;
            }
        }
        return true;
    }
}