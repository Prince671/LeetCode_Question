class Solution {

    static int countJump(int[] nums, int index, int[] dp) {
        if(index>=nums.length-1){
            return 0;
        }

        if (dp[index] != -1) {
            return dp[index];
        }

        int mini=Integer.MAX_VALUE;
        int maxJum=nums[index];

        for(int i=1; i<=maxJum; i++){
            int recursionAns=countJump(nums, index+i, dp);
            if(recursionAns!=Integer.MAX_VALUE){
                mini=Math.min(mini, recursionAns+1);
            }
        }
        dp[index]=mini;
        return dp[index];
        
    }

    public int jump(int[] nums) {

        int index = 0;
        int dp[]=new int[nums.length];
        Arrays.fill(dp, -1);

        return countJump(nums, index, dp);
    }
}