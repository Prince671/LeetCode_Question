
import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Integer> st = new ArrayDeque<>();
        // I Know that if the left digit is Smaller in the Number it will alway Give me the Smaller number , So popping out the Value from the Stack if Found the Greater Value just left to the any Smaller Value 
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';

            while (!st.isEmpty() && st.peek() > digit && k > 0) {
                st.pop(); // poping out the larger value From the Top of the Stack Smaller Value is Found 
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
        while (i < finalAns.length() && finalAns.charAt(i) == '0') { // Finding out all the leading '0' from the Ans -> Eg-: 0000200 -> 200
            i++;
        }

        if (i == finalAns.length()) { 
            return "0";
        }

        return finalAns.substring(i);
    }
}
