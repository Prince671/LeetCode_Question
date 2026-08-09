class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[]=new int[2];
        int i=0;
        int count=0;
        for(int val:nums){
            count=0;
            for(int val2:nums){
                if(val==val2){
                    count++;
                }
            }
            if(count==1)
            {
                ans[i]=val;
                i++;
            }
        }
       
        return ans;
    }
}