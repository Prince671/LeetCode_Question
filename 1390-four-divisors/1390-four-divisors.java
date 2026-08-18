class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;        
        for(int val:nums){
            int count=0;
            int getSum=0;
            for(int i=1; i<=val; i++){
                if(val%i==0){
                    getSum+=i;
                    count++;
                }
                if (count > 4) {
                        break;
                    }
            }
            if(count==4){
                sum+=getSum;
            }
        }
        return sum;
    }
}