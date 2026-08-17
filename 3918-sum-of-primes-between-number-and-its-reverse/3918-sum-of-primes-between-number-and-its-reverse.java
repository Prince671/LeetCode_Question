class Solution {
    public int sumOfPrimesInRange(int n) {
        int val=n;
        int reversed=0;
        while(n>0){
            int digit=n%10;
            reversed=(reversed*10)+digit;
            n/=10;
        }
        
        int sum=0;
        int minVal=Math.min(val, reversed);
        int maxVal=Math.max(val, reversed);
        for(int i=minVal; i<=maxVal; i++){
            int count=0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
              System.out.print(i+" ");
                sum+=i;
            }
        }
        return sum;
    }
}