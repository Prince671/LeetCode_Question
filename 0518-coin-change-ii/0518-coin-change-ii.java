import java.util.*;

class Solution {

    static int getWays(int amount, int[] coins, int index, int[][] dp) {

        if (amount == 0) {
            return 1;
        }

        if (amount < 0 || index >= coins.length) {
            return 0;
        }

        if (dp[amount][index] != -1) {
            return dp[amount][index];
        }

        // Include current coin
        int includeResult =
            getWays(amount - coins[index], coins, index, dp);

        // Exclude current coin
        int excludeResult =
            getWays(amount, coins, index + 1, dp);

        dp[amount][index] = includeResult + excludeResult;

        return dp[amount][index];
    }

    public int change(int amount, int[] coins) {

        int[][] dp = new int[amount + 1][coins.length];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return getWays(amount, coins, 0, dp);
    }
}