class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
      for(int i=0; i<arr.length; i++){
       int bits=Integer.parseInt(Integer.toBinaryString(i));
       int count=0;
       while(bits>0){
        int digit=bits%10;
        if(digit==1){
          count++;
        }
        bits/=10;
       }
       arr[i]=count;
      }

      return arr;
    }
}