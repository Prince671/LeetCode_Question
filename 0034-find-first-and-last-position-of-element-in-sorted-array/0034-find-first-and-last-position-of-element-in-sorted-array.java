class Solution {
    public int[] searchRange(int[] nums, int target) {

        int lb = 0;
        int ub = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {

            if (lb < nums.length && nums[lb] < target) {
                lb++;
            }

            if (ub >= 0 && nums[ub] > target) {
                ub--;
            }
        }

        if (lb > ub || lb == nums.length || ub < 0 ||
            nums[lb] != target || nums[ub] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{lb, ub};
    }
}