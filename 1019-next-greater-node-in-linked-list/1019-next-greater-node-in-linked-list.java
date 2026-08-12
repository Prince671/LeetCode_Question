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
        int i = 0;

        ListNode iterateNode = head;

        while (iterateNode != null) {

            int val = iterateNode.val;
            ListNode getVal = iterateNode.next;

            while (getVal != null) {

                int val2 = getVal.val;

                if (val2 > val) {
                    ans[i] = val2;
                    break;
                }

                getVal = getVal.next;
            }

            i++;
            iterateNode = iterateNode.next;
        }

        return ans;
    }
}