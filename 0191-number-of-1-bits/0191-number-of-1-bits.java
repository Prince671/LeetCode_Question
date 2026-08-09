class Solution {
    public int hammingWeight(int n) {
        String val=Integer.toBinaryString(n);
       int count=0;
       for(int i=0; i<val.length(); i++){
        char ch=val.charAt(i);
        if(ch=='1'){
            count++;
        }
       }
       return count;
    }
}