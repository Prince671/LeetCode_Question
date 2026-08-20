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
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> values=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            values.add(temp.val);
            temp=temp.next;
        }
        int x=values.get(k-1);
        int y=values.get(values.size()-k);
        values.set(k-1, y);
        values.set(values.size()-k, x);

        ListNode current=head;
        int index=0;
        while(current!=null){
            current.val=values.get(index);
            current=current.next;
            index++;
        }
        return head;

    }
}