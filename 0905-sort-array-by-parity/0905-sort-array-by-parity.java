class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1){
            return nums;
        }
        int newArr[]=new int[nums.length];
        int i=0;
        int k=nums.length-1;
        for(int j=0; j<nums.length; j++){
            if(nums[j]%2==0){
                newArr[i]=nums[j];
                i++;
            }
            else{
                newArr[k]=nums[j];
                k--;
            }
        }
        return newArr;
        
    }
}