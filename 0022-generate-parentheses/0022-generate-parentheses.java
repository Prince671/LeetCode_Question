import java.util.*;

class Solution {
    static void generate(int n, int open, int close,
                         String current, List<String> result) {

        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // Include opening bracket
        if (open < n) {
            generate(n, open + 1, close, current + "(", result);
        }

        // Include closing bracket
        if (close < open) {
            generate(n, open, close + 1, current + ")", result);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(n, 0, 0, "", result);
        return result;
    }
}