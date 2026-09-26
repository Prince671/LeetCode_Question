class Solution {
    public int differenceOfSum(int[] nums) {
        int digitSum=0;
        int elementSum=0;
        for(int i=0; i<nums.length; i++){
            elementSum+=nums[i];
            while(nums[i]>0){
                int digit=nums[i]%10;
                digitSum+=digit;
                nums[i]/=10;
            }
        }
        return Math.abs(elementSum-digitSum);
    }
}