class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int i=0;
        int reversed=0;
        while(n>0){
            int digit=n%10;
            reversed=reversed*10+digit;
            n/=10;
        }
        while(reversed>0){
            int digit=reversed%10;
            if(i%2==0){
                sum+=digit;
            }
            else{
                sum-=digit;
            }
            i++;
            reversed/=10;
        }
        return sum;
    }
}