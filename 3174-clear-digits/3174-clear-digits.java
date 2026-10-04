class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(!Character.isDigit(ch)){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    continue;
                }
                else{
                    st.pop();
                }
            }
        }
        StringBuilder str=new StringBuilder();
        for(char ch:st){
            str.append(String.valueOf(ch));
        }
        return str.toString();
    }
}