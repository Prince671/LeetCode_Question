class Solution {
    public String sortVowels(String s) {
        
        char finalStr[]=new char[s.length()];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            finalStr[i]=ch;
        }

        String vowel="aeiouAEIOU";
        String vowelInString="";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(vowel.contains(String.valueOf(ch))){
                vowelInString+=String.valueOf(ch);
            }
        }

        char[] sortedVowel = new char[vowelInString.length()];

        for (int i = 0; i < vowelInString.length(); i++) {
            char ch = vowelInString.charAt(i);
            sortedVowel[i] = ch;
        }
        Arrays.sort(sortedVowel);

        int x=0;
        
        for(int i=0; i<finalStr.length; i++){
            if(vowel.contains(String.valueOf(finalStr[i]))){
                finalStr[i]=sortedVowel[x];
                x++;
            }
        }

        String ans="";
        for(char ch:finalStr){
            ans+=String.valueOf(ch);
        }
        return ans;

    }
}