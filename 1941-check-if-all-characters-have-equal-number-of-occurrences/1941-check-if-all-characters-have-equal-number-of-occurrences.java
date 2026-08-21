class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[]=new int[26];
        for(int i=0; i<s.length(); i++){
        char ch=s.charAt(i);
        freq[ch-'a']++;
      }
      int count=0;
      for(int i=0; i<s.length(); i++){
        char ch=s.charAt(i);
        if(count==0){
          count=freq[ch-'a'];
        }else{
          if(count==freq[ch-'a']){
            count=freq[ch-'a'];
          }else{
            return false;
          }
        }
      }
      return true;
    }
}