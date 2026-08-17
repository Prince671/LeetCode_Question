class Solution {
    public String reverseWords(String s) {
    String[] str=s.split(" ");
    StringBuilder ans= new StringBuilder();
    for(int i=0; i<str.length; i++){
      int start=0;
      int end=str[i].length()-1;
      char arr[]=str[i].toCharArray();
      while(start<=end){
        char ch=arr[start];
        arr[start]=arr[end];
        arr[end]=ch;
        start++;
        end--;
      }
      
      ans.append(new String(arr));
      if(i+1!=str.length){
        ans.append(" ");
      }
    }
    return ans.toString();
    }
}