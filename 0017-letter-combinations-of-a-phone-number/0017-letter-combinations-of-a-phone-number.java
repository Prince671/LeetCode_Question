class Solution {
    static void getCombinaion(String digits, int index, String[] map, List<String> ans, StringBuilder output){
        if(index>=digits.length()){
            ans.add(output.toString());
            return;
        }
        int value=digits.charAt(index)-'0';
        String mappedString=map[value];

        for(int i=0; i<mappedString.length(); i++){
            output.append(mappedString.charAt(i));
            getCombinaion(digits, index+1, map, ans, output);
            //backTracking 
            output.deleteCharAt(output.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    List<String> ans=new ArrayList<>();
    StringBuilder output=new StringBuilder();
    int index=0;
    getCombinaion(digits, index, map, ans, output);
    return ans;
    }
}