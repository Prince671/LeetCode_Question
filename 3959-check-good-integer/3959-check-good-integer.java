class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum=0;
        int sqSum=0;
        int val=n;
        while(val>0){
            int digit=val%10;
            digitSum+=digit;
            sqSum+=digit*digit;
            val/=10;
        }
        return sqSum-digitSum>=50;
    }
}