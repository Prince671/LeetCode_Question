class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        int k=0;
        for(int val:nums){
            ans[k]=val;
            k++;
        }
        for(int i=n-1; i>=0; i--){
            ans[k]=nums[i];
            k++;
        }
        return ans;
    }
}