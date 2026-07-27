class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftProductArr[]=new int[nums.length];
        int rightProductArr[]=new int[nums.length];
        int lp=0;
        int rp=0;
        Arrays.fill(leftProductArr, 1);
        Arrays.fill(rightProductArr, 1);
        for(int i=0; i<nums.length; i++){
            for (int j = 0; j < i; j++) {
                leftProductArr[i] *= nums[j];
            }
            for(int j1=i+1; j1<nums.length; j1++){
                rightProductArr[rp]*=nums[j1];
                
            }
            lp++;
            rp++;
        }
        for(int i=0; i<nums.length; i++){
          nums[i]=leftProductArr[i]*rightProductArr[i];
        }
        return nums;

    }
}