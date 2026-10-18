
import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';

            while (!st.isEmpty() && st.peek() > digit && k > 0) {
                st.pop();
                k--;
            }

            st.push(digit);
        }

        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        StringBuilder finalAns = new StringBuilder();

        while (!st.isEmpty()) {
            finalAns.append(st.removeLast());
        }

        int i = 0;
        while (i < finalAns.length() && finalAns.charAt(i) == '0') {
            i++;
        }

        if (i == finalAns.length()) {
            return "0";
        }

        return finalAns.substring(i);
    }
}
