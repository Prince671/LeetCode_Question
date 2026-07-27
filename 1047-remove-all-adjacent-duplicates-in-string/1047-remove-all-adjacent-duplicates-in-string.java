class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char currentVal=s.charAt(i);
            if(!st.isEmpty() && currentVal==st.peek()){
                st.pop();
            }else{
                st.push(currentVal);
            }
        }
        StringBuilder remainingStr=new StringBuilder();
        for(char val:st){
            remainingStr.append(val);
        }
        return remainingStr.toString();
    }
}