
import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        Deque<String> st = new ArrayDeque<>();
        String arr[] = path.split("/");

        for (String val : arr) {
            if (val.isEmpty() || val.equals(".")) {
                continue;
            }

            if (val.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(val);
            }
        }

        if (st.isEmpty()) {
            return "/";
        }

        StringBuilder result = new StringBuilder();

        while (!st.isEmpty()) {
            result.append("/");
            result.append(st.removeLast());
        }

        return result.toString();
    }
}
