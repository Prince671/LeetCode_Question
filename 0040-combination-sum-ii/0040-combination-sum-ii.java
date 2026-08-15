class Solution {
    static void getCombination(int[] candidates, int target, int index, List<List<Integer>> ans, List<Integer> combination){
        if(target==0){
            ans.add(new ArrayList<>(combination));
            return;
        }
        if(index>=candidates.length || target<0){
            return;
        }
        
        //include value
        combination.add(candidates[index]);
        // calling
        getCombination(candidates, target-candidates[index], index+1,  ans, combination);
        //excluding the value;
        combination.remove(combination.size()-1);
        int nextIndex = index + 1;

        while (nextIndex < candidates.length && candidates[nextIndex] == candidates[index]) {
            nextIndex++;
        }

        // Exclude the value
        getCombination(
                candidates,
                target,
                nextIndex,
                ans,
                combination
        );

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      Arrays.sort(candidates);
      List<List<Integer>> ans=new ArrayList<>();
      List<Integer> combination=new ArrayList();
      int index=0;
      getCombination(candidates, target, index, ans, combination);
      return ans;
    }
}