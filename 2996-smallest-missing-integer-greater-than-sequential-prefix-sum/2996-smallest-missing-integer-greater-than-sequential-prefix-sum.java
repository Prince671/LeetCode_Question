class Solution {
    public int missingInteger(int[] nums) {
       int sum=nums[0];
        for(int i=1; i<nums.length; i++){
            if( nums[i]-1==nums[i-1]){
                sum+=nums[i];
            }else{
                    break;
                }

        }
        boolean isFound=true;
        Arrays.sort(nums);
        while(isFound){
            for(int val:nums){
                if(val==sum){
                    sum++;
                }
                
            }
            isFound=false;
        }
        return sum;
    }
}