class Solution {
    public String toLowerCase(String s) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            ans.append(Character.toLowerCase(s.charAt(i)));
        }

        return ans.toString();
    }
}