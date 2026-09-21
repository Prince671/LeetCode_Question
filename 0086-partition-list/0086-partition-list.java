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
    public ListNode partition(ListNode head, int x) {
        ListNode ansHead=new ListNode(-1);
        ListNode ansTail=ansHead;
        ListNode ansHead2=new ListNode(-1);
        ListNode ansTail2=ansHead2;

        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                ansTail.next=temp;
                ansTail=temp;
            }else{
                ansTail2.next=temp;
                ansTail2=temp;
            }
            temp=temp.next;
        }
        ansTail.next=ansHead2.next;
        ansTail2.next=null;

        return ansHead.next;
    }
}