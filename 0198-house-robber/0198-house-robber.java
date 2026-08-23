class Solution {
    static int getMaxMoney(int nums[], int index, int dp[]){
        if(index>=nums.length){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int includeMoney=nums[index]+getMaxMoney(nums, index+2, dp);
        int excludeMoney=0+getMaxMoney(nums, index+1, dp);
        int finalAns=Math.max(includeMoney, excludeMoney);
        dp[index]=finalAns;
        return finalAns;
    }
    public int rob(int[] nums) {
        int index=0;
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);
        int ans=getMaxMoney(nums, index, dp);
        return ans;
    }
}