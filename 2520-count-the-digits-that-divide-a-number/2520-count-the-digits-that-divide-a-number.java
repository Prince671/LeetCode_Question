class Solution {
    public int countDigits(int num) {
        int orignalValue=num;
        int ans=0;
        while(num>0){
            int digit=num%10;
            if(orignalValue%digit==0){
                ans+=1;
            }
            num/=10;
        }
        return ans;
    }
}