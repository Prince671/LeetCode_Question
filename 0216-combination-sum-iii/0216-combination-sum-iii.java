class Solution {

    static void getCombination(
            int[] arr,
            int index,
            int k,
            int n,
            List<List<Integer>> ans,
            List<Integer> combination) {

        // Exactly k numbers selected and target reached
        if (k == 0) {
            if (n == 0) {
                ans.add(new ArrayList<>(combination));
            }
            return;
        }

        if (index >= arr.length || n < 0) {
            return;
        }

        // Include the value
        combination.add(arr[index]);

        getCombination(
            arr,
            index + 1,
            k - 1,
            n - arr[index],
            ans,
            combination
        );

        // Backtrack
        combination.remove(combination.size() - 1);

        // Exclude the value
        getCombination(
            arr,
            index + 1,
            k,
            n,
            ans,
            combination
        );
    }

    public List<List<Integer>> combinationSum3(int k, int n) {

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = i + 1;
        }

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();

        getCombination(arr, 0, k, n, ans, combination);

        return ans;
    }
}