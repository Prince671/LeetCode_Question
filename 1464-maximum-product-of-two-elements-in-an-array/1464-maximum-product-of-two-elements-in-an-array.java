class Solution {
    public int maxProduct(int[] nums) {
        int sMax=0;
      int max=0;
    
      for(int val:nums){
        if(val>=max){
          sMax=max;
          max=val;
        }
        if(val<max && val>sMax){
          sMax=val;
        }
      }
      return (sMax-1)*(max-1);
    }
}