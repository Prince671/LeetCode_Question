import java.util.*;

class Solution {
    static boolean isPossiblePartition(int nums[], int index,
                                       int target, int[][] dp) {
        if (target == 0) {
            return true;
        }

        if (index >= nums.length || target < 0) {
            return false;
        }

        if (dp[index][target] != -1) {
            return dp[index][target] == 1;
        }

        boolean include = isPossiblePartition(
                nums, index + 1, target - nums[index], dp);

        boolean exclude = isPossiblePartition(
                nums, index + 1, target, dp);

        boolean ans = include || exclude;

        dp[index][target] = ans ? 1 : 0;

        return ans;
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;

        for (int i : nums) {
            sum += i;
        }

        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;
        int n = nums.length;

        int[][] dp = new int[n][target + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return isPossiblePartition(nums, 0, target, dp);
    }
}