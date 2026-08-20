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
    static ListNode reverse(ListNode prev, ListNode current){
        if(current==null){
            return prev;
        }
        ListNode nextNode=current.next;
        current.next=prev;
        prev=current;
        current=nextNode;
        ListNode ans=reverse(prev, current);
        return ans;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode current=head;
    //    while(current!=null){
    //     ListNode nextNode=current.next;
    //     current.next=prev;
    //     prev=current;
    //     current=nextNode;;
    //    }
    //    return prev;

    ListNode ans=reverse(prev, current);
    return ans;


    }
}