class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char sArr[]=s.toCharArray();
        char tArr[]=t.toCharArray();
          Arrays.sort(sArr);
        Arrays.sort(tArr);
        int j=0;
        for(int i=0; i<sArr.length; i++ ){
            if(sArr[i]==tArr[j]){
                j++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}