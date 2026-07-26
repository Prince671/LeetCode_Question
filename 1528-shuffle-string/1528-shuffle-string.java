class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder str=new StringBuilder();
        char shuffled[]=new char[s.length()];
        for(int i=0; i<s.length(); i++){
            shuffled[indices[i]]=s.charAt(i);
        }
        return new String(shuffled);
    }
}