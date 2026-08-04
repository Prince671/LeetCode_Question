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

    public ListNode insertionSortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        while (current != null) {

            // Assume current node is the minimum
            ListNode minNode = current;

            // Find the minimum node in the remaining list
            ListNode compare = current.next;

            while (compare != null) {

                if (compare.val < minNode.val) {
                    minNode = compare;
                }

                compare = compare.next;
            }

            // Swap values
            int temp = current.val;
            current.val = minNode.val;
            minNode.val = temp;

            current = current.next;
        }

        return head;
    }
}