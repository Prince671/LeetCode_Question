import java.util.*;

class Solution {
    static int getWays(int[] coins, int amount, int[][] dp) {
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return Integer.MAX_VALUE;
        }

        if (dp[amount][0] != -1) {
            return dp[amount][0];
        }

        int mini = Integer.MAX_VALUE;

        for (int coin : coins) {
            int recursionAns = getWays(coins, amount - coin, dp);

            if (recursionAns != Integer.MAX_VALUE) {
                int totalCoinUsed = recursionAns + 1;
                mini = Math.min(mini, totalCoinUsed);
            }
        }

        return dp[amount][0] = mini;
    }

    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[amount + 1][1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = getWays(coins, amount, dp);

        if (ans != Integer.MAX_VALUE) {
            return ans;
        }

        return -1;
    }
}