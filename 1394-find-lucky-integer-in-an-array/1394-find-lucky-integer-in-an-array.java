class Solution {
    public int findLucky(int[] arr) {
        int count = 0;
        int ans = -1;

        for (int val : arr) {
            count = 0;

            for (int val2 : arr) {
                if (val == val2) {
                    count++;
                }
            }

            if (count == val) {
                if (val > ans) {
                    ans = val;
                }
            }
        }

        return ans;
    }
}