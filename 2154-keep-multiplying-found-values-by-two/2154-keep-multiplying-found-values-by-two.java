class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n=nums.length; 
        Arrays.sort(nums);
        int val=original;
        for(int x:nums){
            if(x==val){
                val*=2;
            }
        }
        return val;
    }
}