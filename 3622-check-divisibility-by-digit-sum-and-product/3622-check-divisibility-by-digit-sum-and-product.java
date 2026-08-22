class Solution {
    public boolean checkDivisibility(int n) {
        int originalVal=n;
        int sum=0;
        int mul=1;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            mul*=digit;
            n/=10;
        }
        if(originalVal%(sum+mul)==0){
            return true;
        }
        return false;
    }
}