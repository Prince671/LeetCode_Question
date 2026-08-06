class Solution {
    public long sumAndMultiply(int n) {
        if(n==0){
            return n;
        }
       long sortedVal=0;
        long place=1;
        long sumOfSorted=0;
        while(n>0){
          long digit=n%10;
          
          if(digit!=0){
            sortedVal+=digit*place;
            place*=10;
            sumOfSorted+=digit;
          }
          n/=10;
        }



        return sortedVal* sumOfSorted; 
    }
}