class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int operationCount = 0;

        for (int val : nums) {
            max = Math.max(max, val);
        }

        for (int val : nums) {
            operationCount += max - val;
        }

        return operationCount;
    }
}