class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int count=0;
        Set<Integer> st=new HashSet<>();
        for(int val:nums){
            if(!st.contains(val)){
                st.add(val);
            }else{
                l.add(val);
            }
        }
        return l;
    }
}