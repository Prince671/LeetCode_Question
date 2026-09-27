import java.util.*;

class Solution {
    static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static int solve(String s, int index, int[] dp) {
        if (index == s.length()) {
            return 0;
        }

        if (dp[index] != -1) {
            return dp[index];
        }

        int mini = Integer.MAX_VALUE;

        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                int cuts = 1 + solve(s, i + 1, dp);
                mini = Math.min(mini, cuts);
            }
        }

        return dp[index] = mini;
    }

    public int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return solve(s, 0, dp) - 1;
    }
}