class Solution {
    static void getSubset(int nums[], List<List<Integer>> ans, List<Integer> subset, int index){
        if(index>=nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
        //include case
        subset.add(nums[index]);
        // now makeing a call while including that value 
        getSubset(nums, ans, subset, index+1);
        
        // now removing that value from subset list for making  a call while excluding that value 
        subset.remove(subset.size()-1);
        getSubset(nums, ans, subset, index+1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        int index=0;

        getSubset(nums, ans, subset, index);
        return ans;
    }
}