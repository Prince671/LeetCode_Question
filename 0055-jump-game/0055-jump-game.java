class Solution {

    static boolean isPossible(int[] nums, int index, Boolean[] dp) {

        if (index >= nums.length - 1) {
            return true;
        }

        if (nums[index] == 0) {
            return false;
        }

        if (dp[index] != null) {
            return dp[index];
        }

        int maxJump = nums[index];
        boolean overAllAns = false;

        for (int i = 1; i <= maxJump; i++) {

            boolean recursionAns =
                isPossible(nums, index + i, dp);

            overAllAns = overAllAns || recursionAns;

            // Stop as soon as a valid path is found
            if (overAllAns) {
                break;
            }
        }

        dp[index] = overAllAns;

        return dp[index];
    }

    public boolean canJump(int[] nums) {

        int index = 0;

        Boolean[] dp = new Boolean[nums.length];

        return isPossible(nums, index, dp);
    }
}