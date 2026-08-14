class Solution {
    static void getCombination(int[] candidate, int target, List<Integer> oneCombination, int index, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(oneCombination));
            return;
        }
        if(index>=candidate.length || target<0){
            return;
        }
        //incuding the value
        oneCombination.add(candidate[index]);
        // making call -> include Val call 
        getCombination(candidate, target-candidate[index], oneCombination, index, ans);

        //exclude the value 
        oneCombination.remove(oneCombination.size()-1);
        // making call -> exclude Val call 
        getCombination(candidate, target, oneCombination, index+1, ans);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> oneCombination =new ArrayList<>();
        int index=0;
        getCombination(candidates, target, oneCombination, index, ans);
        return ans;
       
        
    }
}