/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        
        int length = 0;
        ListNode findLength = head;

        while (findLength != null) {
            length++;
            findLength = findLength.next;
        }

        int[] ans = new int[length];
        Deque<int[]> st=new ArrayDeque<>();
        ListNode temp=head;
        int index=0;
        while(temp!=null){
            int val=temp.val;
            while(!st.isEmpty() && val>st.peek()[0] ){
                int index1=st.peek()[1];
                int result=st.pop()[0];
                ans[index1]=val;
            }
            st.push(new int[]{val, index});
            index++;
            temp=temp.next;
        }
        return ans;
    }
}