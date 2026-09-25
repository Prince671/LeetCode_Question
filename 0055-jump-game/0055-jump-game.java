class Solution {

    static boolean isPossible(int[] nums, int index, Boolean[] dp) {

        // Reached the last index
        if (index >= nums.length - 1) {
            return true;
        }

        // Cannot move forward
        if (nums[index] == 0) {
            return false;
        }

        // Already calculated
        if (dp[index] != null) {
            return dp[index];
        }

        int maxJump = nums[index];

        for (int i = 1; i <= maxJump; i++) {

            boolean recursionAns =
                isPossible(nums, index + i, dp);

            // If any path reaches the end
            if (recursionAns) {
                dp[index] = true;
                return true;
            }
        }

        // No path can reach the end
        dp[index] = false;

        return false;
    }

    public boolean canJump(int[] nums) {

        Boolean[] dp = new Boolean[nums.length];

        return isPossible(nums, 0, dp);
    }
}