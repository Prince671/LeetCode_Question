class Solution {

    static void getSubset(int nums[], List<List<Integer>> ans,
                           List<Integer> subset, int index) {

        if (index >= nums.length) {
            ans.add(new ArrayList<>(subset));
            return;
        }

        // Include case
        subset.add(nums[index]);

        getSubset(nums, ans, subset, index + 1);

        // Exclude case
        subset.remove(subset.size() - 1);

        // Skip duplicate value
        int nextIndex = index + 1;

        while (nextIndex < nums.length &&
               nums[nextIndex] == nums[index]) {
            nextIndex++;
        }

        getSubset(nums, ans, subset, nextIndex);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        Arrays.sort(nums);

        getSubset(nums, ans, subset, 0);

        return ans;
    }
}