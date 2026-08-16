class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int index=0;
        for(int i=0; i<n; i++){
            ans[index]=nums[nums[i]];
            index++;
        }
        return ans;
    }
}