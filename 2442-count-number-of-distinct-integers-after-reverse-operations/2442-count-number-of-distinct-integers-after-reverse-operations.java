class Solution {
    public int countDistinctIntegers(int[] nums) {
        ArrayList<Integer> allValues=new ArrayList<>();
        for(int val:nums){
            allValues.add(val);
        }
        for(int i=0; i<nums.length; i++){
            int num=nums[i];
            int reversed=0;
            while(num>0){
                int digit=num%10;
                reversed=(reversed*10)+digit;
                num/=10;
            }
            allValues.add(reversed);
        }
        Set<Integer> st=new HashSet<>();
        for(int val:allValues){
            st.add(val);
        }
        return st.size();
    }
}