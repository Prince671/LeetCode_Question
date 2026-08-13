class Solution {
    public int[] transformArray(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int zeroCount = 0;

        // Count even numbers
        for (int num : nums) {
            if (num % 2 == 0) {
                zeroCount++;
            }
        }

        // Fill 0s and 1s
        for (int i = 0; i < n; i++) {
            if (i < zeroCount) {
                ans[i] = 0;
            } else {
                ans[i] = 1;
            }
        }

        return ans;
    }
}