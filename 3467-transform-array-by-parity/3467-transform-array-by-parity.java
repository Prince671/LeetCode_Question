class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length;
        int k=0;
        int ans[]=new int[n];
        for(int i=0; i<n; i++){
            if(nums[i]%2==0){
                nums[i]=0;
                ans[k]=nums[i];
                
            }else{
                nums[i]=1;
                ans[k]=nums[i];
            }
            k++;
        }
        Arrays.sort(ans);
        return ans;
    }
}