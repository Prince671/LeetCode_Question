class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Set<Integer> getDuplicate=new HashSet<>();
        int xor=0;
        for(int val:nums){
            if(!getDuplicate.contains(val)){
                getDuplicate.add(val);
            }else{
                xor^=val;
            }

        }
        return xor;
    }
}