class Solution {
    public int subtractProductAndSum(int n) {
        int val=n;
        
        int product=1;
        int sum=0;

        while(val>0){
            product*=val%10;
            sum+=val%10;
            val/=10;
        }
        return product-sum;
    }
}