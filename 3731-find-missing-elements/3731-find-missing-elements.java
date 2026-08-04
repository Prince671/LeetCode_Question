class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        boolean isFound=false;
        List<Integer> result=new ArrayList<>();
        for(int i=min; i<max; i++){
            isFound=false;
            for(int val:nums){
                if(i==val){
                    isFound=true;
                }
            }
            if(!isFound){
                 result.add(i);
            }
           
        }
        return result;
    }
}