class Solution {
    public String reversePrefix(String s, int k) {
        char[] str=s.toCharArray();
      int start=0;
      int end=k-1;
      while(start<=end){
        char ch=str[start];
        str[start]=str[end];
        str[end]=ch;
        start++;
        end--;
      }
      StringBuilder ans=new StringBuilder();
      for(char ch:str){
        ans.append(ch);
      }
      return ans.toString();
    }
}