import java.util.*;

class Solution {
    static int getCombi(int[] nums, int target, int[] dp) {
        if (target == 0) {
            return 1;
        }

        if (dp[target] != -1) {
            return dp[target];
        }

        int total = 0;

        for (int num : nums) {
            if (target >= num) {
                total += getCombi(nums, target - num, dp);
            }
        }

        dp[target] = total;
        return dp[target];
    }

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, -1);

        return getCombi(nums, target, dp);
    }
}