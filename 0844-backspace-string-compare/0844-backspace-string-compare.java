class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();

        // Process s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '#') {
                if (!sStack.isEmpty()) {
                    sStack.pop();
                }
            } else {
                sStack.push(ch);
            }
        }

        // Process t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (ch == '#') {
                if (!tStack.isEmpty()) {
                    tStack.pop();
                }
            } else {
                tStack.push(ch);
            }
        }

        // If sizes are different, strings cannot be equal
        if (sStack.size() != tStack.size()) {
            return false;
        }

        // If both are non-empty, compare top
        if (!sStack.isEmpty() && !tStack.isEmpty()) {
            if (sStack.peek() != tStack.peek()) {
                return false;
            }
        }

        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();

        for (char ch : sStack) {
            str.append(ch);
        }

        for (char ch : tStack) {
            str1.append(ch);
        }

        return str1.toString().equals(str.toString());
    }
}