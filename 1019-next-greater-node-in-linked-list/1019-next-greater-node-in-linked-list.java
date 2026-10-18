
import java.util.*;

class Solution {
    public int[] nextLargerNodes(ListNode head) {

        int length = 0;
        ListNode findLength = head;

        while (findLength != null) {
            length++;
            findLength = findLength.next;
        }

        int[] ans = new int[length];
        Deque<int[]> st = new ArrayDeque<>();

        ListNode temp = head;
        int index = 0;

        while (temp != null) {
            int val = temp.val;

            while (!st.isEmpty() && val > st.peek()[0]) {
                int index1 = st.pop()[1];
                ans[index1] = val;
            }

            st.push(new int[]{val, index});
            index++;
            temp = temp.next;
        }

        return ans;
    }
}
