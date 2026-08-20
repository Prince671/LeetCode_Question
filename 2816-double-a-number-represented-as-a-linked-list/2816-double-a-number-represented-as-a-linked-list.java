import java.math.BigInteger;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { 
 *         this.val = val; 
 *         this.next = next; 
 *     }
 */

class Solution {
    public ListNode doubleIt(ListNode head) {

        StringBuilder values = new StringBuilder();

        ListNode temp = head;

        while(temp != null) {
            values.append(temp.val);
            temp = temp.next;
        }

        // Fix: convert StringBuilder to BigInteger and multiply by 2
        BigInteger value = new BigInteger(values.toString());
        String result = value.multiply(BigInteger.valueOf(2)).toString();

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for(int i = 0; i < result.length(); i++) {

            char ch = result.charAt(i);

            ListNode newNode =
                new ListNode(Integer.parseInt(String.valueOf(ch)));

            current.next = newNode;
            current = current.next;
        }

        return dummy.next;
    }
}