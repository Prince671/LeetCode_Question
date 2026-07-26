class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String concatenatedString = s + s;

        return concatenatedString.contains(goal);
    }
}