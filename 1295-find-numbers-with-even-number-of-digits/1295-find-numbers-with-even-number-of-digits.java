class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int ans=0;
        for(int val:nums){
            count=0;
            int n=val;
            while(n>0){
                n/=10;
                count++;
            }
            if(count%2==0){
                ans++;
            }
        }
        return ans;
    }
}