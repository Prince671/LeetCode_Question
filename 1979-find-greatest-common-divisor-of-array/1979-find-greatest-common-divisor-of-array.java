class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int val:nums){
            if(val>max){
                max=val;
            }
            if(val<min){
                min=val;
            }
        }
        int result=0;
        for(int i=1; i<=max; i++){
            if(min%i==0 && max%i==0){
                result=Math.max(result, i);
            }
        }
        return result;
    }
}