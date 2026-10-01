class Solution {
    public int firstStableIndex(int[] nums, int k) {
        Stack<Integer> st = new Stack<>();
        int index=0;
        while(index<nums.length){
            int mini=Integer.MAX_VALUE;
            int maxi=Integer.MIN_VALUE;
            st.push(nums[index]);

            for(int val:st){
                if(val>maxi){
                    maxi=val;
                }
            }
            for(int i=index; i<nums.length; i++){
                if(nums[i]<mini){
                    mini=nums[i];
                }
            }
            int  instabilityScore=maxi-mini;

            if(instabilityScore<=k){
                return index;
            }

            index++;

        }
        return -1;
    }
}