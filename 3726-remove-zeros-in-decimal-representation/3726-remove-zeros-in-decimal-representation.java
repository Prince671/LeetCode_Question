class Solution {
    public long removeZeros(long n) {
        if(n<9){
            return n;
        }
        long val=n;
        long sum=0;
        while(val>0){
            long digit=val%10;
            System.out.print(digit+ " ");
            if(digit!=0){
                sum*=10;
                sum+=digit;
            }
            val/=10;
        }
        System.out.println(sum);
        long ans=0;
        while(sum>0){
            long digit=sum%10;
            
            ans*=10;ans+=digit;
            sum/=10;
        }
        return ans;
    }
}