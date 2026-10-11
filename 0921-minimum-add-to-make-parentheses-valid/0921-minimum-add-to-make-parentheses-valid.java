class Solution {
    public int minAddToMakeValid(String s) {
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
    }
}