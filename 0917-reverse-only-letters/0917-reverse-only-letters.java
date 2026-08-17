class Solution {
    public String reverseOnlyLetters(String s) {

        char[] str = s.toCharArray();

        int start = 0;
        int end = str.length - 1;

        while (start < end) {

            if (!Character.isLetter(str[start])) {
                start++;
                continue;
            }

            if (!Character.isLetter(str[end])) {
                end--;
                continue;
            }

            char ch = str[start];
            str[start] = str[end];
            str[end] = ch;

            start++;
            end--;
        }

        return new String(str);
    }
}