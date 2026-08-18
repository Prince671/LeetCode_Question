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
    static int gcd(int x, int y){
        int max=Math.max(x, y);
        int result=0;
        for(int i=1; i<=max; i++){
            if(x%i==0 && y%i==0){
                result=Math.max(result, i);
            }
        }
        return result;        
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
         ListNode current = head;

        while (current != null && current.next != null) {

            int divisor = gcd(current.val, current.next.val);

            ListNode newNode = new ListNode(divisor);

            newNode.next = current.next;
            current.next = newNode;

            current = newNode.next;
        }

        return head;       
    }
}