import java.util.*;

class Solution {
    static int robHouse(int[] nums, int index, int end, int[] dp) {
        if (index >= end) {
            return 0;
        }

        if (dp[index] != -1) {
            return dp[index];
        }

        int includeMoney = nums[index]
                + robHouse(nums, index + 2, end, dp);

        int excludeMoney = robHouse(nums, index + 1, end, dp);

        dp[index] = Math.max(includeMoney, excludeMoney);
        return dp[index];
    }

    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        // Case 1: Exclude the last house
        int[] dp1 = new int[n + 1];
        Arrays.fill(dp1, -1);
        int withoutLastHouseMoney = robHouse(nums, 0, n - 1, dp1);

        // Case 2: Exclude the first house
        int[] dp2 = new int[n + 1];
        Arrays.fill(dp2, -1);
        int withoutFirstHouseMoney = robHouse(nums, 1, n, dp2);

        return Math.max(withoutLastHouseMoney, withoutFirstHouseMoney);
    }
}