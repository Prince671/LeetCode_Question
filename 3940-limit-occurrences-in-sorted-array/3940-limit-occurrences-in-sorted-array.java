class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> store=new ArrayList<>();
        int count=0;
        int previousVal=0;
        
        for(int val:nums){
            
            if(previousVal!=val){
                count=0;
            }
            previousVal=val;
            if(count<k){
                store.add(val);
                count++;
            }
        }
        int ans[]=new int[store.size()];
        int i=0;
        for(int val:store){
            ans[i]=val;
            i++;
        }
        return ans;

    }
}