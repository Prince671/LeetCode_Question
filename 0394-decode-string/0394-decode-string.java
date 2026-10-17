class Solution {
    public String decodeString(String s) {
        Deque<Integer> storeDigit=new ArrayDeque<>();
        Deque<String> storeString=new ArrayDeque<>();
        int number=0;
        String currentString="";
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                number=number*10 + (ch-'0');
            }
            else if(ch=='['){
                storeDigit.push(number);
                storeString.push(currentString);
                number=0;
                currentString="";
            }
            else if(ch==']'){
                int repeatationCount=storeDigit.pop();
                String newStr=currentString.repeat(repeatationCount);
                String completeString=storeString.pop()+newStr;
                currentString=completeString;
            }
            else{
                currentString+=String.valueOf(ch);
            }
        }
        return currentString;
    }
}