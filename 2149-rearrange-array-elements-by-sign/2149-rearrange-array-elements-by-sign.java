class Solution {
    public int[] rearrangeArray(int[] nums) {
        int minusIndex=1;
        int plusIndex=0;
        int ans[]=new int[nums.length];
        for(int val:nums){
            if(val>0){
                ans[plusIndex]=val;
                plusIndex+=2;
            }
            else{
                ans[minusIndex]=val;
                minusIndex+=2;
            }
        }
        return ans;
    }
}