class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }
        int originalVal=num;
        int reversed=0;
        while(num>0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num/=10;
        }
        int reversed2=0;
        while(reversed>0){
            int digit=reversed%10;
            reversed2=reversed2*10+digit;
            reversed/=10;
        }
        if(reversed2==originalVal){
            return true;
        }
        return false;
    }
}