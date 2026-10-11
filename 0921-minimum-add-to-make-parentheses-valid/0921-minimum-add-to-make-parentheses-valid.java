class Solution {
    public int minAddToMakeValid(String s) {
        // Solution 1-> 
            // this is the solution taking O(1) space -> optimal solution 


        /*
        int openBracket=0;
        int addtion=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                openBracket++;
            }else{
                if(openBracket<=0){
                    addtion++;
                }else{
                    openBracket-=1;
                }
            }
        }
        return openBracket+addtion;
        */

        // Solution 2-> 
            // This is Solution Using Stack -> O(n) Space Complex...

        Deque<Character> st=new ArrayDeque<>();
        int addtion =0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    addtion++;
                }else{
                    st.pop();
                }
            }

        }
        int finalAns=addtion+st.size();
        return finalAns;


    }
}