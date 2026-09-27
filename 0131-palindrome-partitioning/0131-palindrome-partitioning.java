import java.util.*;

class Solution {

    static boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            newStr.append(s.charAt(i));
        }

        return newStr.toString().equals(s);
    }

    static void palinDrom_part(String s, int index,
                               List<String> value,
                               List<List<String>> result) {

        // Base case
        if (index >= s.length()) {
            result.add(new ArrayList<>(value));
            return;
        }

        // Try every possible substring
        for (int i = index; i < s.length(); i++) {
            String sub = s.substring(index, i + 1);

            // Check whether substring is palindrome
            if (isPalindrome(sub)) {

                // Include
                value.add(sub);

                // Recursive call for remaining string
                palinDrom_part(s, i + 1, value, result);

                // Backtracking
                value.remove(value.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> value = new ArrayList<>();

        palinDrom_part(s, 0, value, result);

        return result;
    }
}