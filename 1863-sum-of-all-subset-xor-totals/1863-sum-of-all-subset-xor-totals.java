class Solution {
    static void getSubset(int[] nums, int index, List<List<Integer>> ans, List<Integer> subset){
        if(index>=nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
        //include val 
        subset.add(nums[index]);
        //calling with include
        getSubset(nums, index+1, ans, subset);
        //exlude 
        subset.remove(subset.size()-1);
        getSubset(nums, index+1, ans, subset);
    }
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
      List<Integer> subset=new ArrayList<>();
      int index=0;
      getSubset(nums, index, ans, subset);
      int getMaxXor=0;
      for(int i=0; i<ans.size(); i++){
        int xor=0;
        for(int j=0; j<ans.get(i).size(); j++){
          xor^=ans.get(i).get(j);
        }
        getMaxXor+=xor;
      }
      return getMaxXor;
    }
}