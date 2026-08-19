class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int result=-1;
        int originalVal=x;
        int sum=0;
        while(x>0){
            int digit=x%10;
            sum+=digit;
            x/=10;
        }
        if(originalVal%sum==0){
            result=sum;
        }
        return result;
    }
}