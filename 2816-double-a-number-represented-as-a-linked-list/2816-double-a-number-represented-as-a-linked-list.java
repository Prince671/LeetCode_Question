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
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {

        // Step 1. Reverse a LL
        head=reverse(head);
        //step 2 . Double its Value
        ListNode temp=head;
        ListNode ansTail=temp;
        int carry=0;
        while(temp!=null){
            int value=temp.val;
            int sum=value+value+carry;
            int digit=sum%10;
            temp.val=digit;

            carry=sum/10;
            ansTail=temp;
            temp=temp.next;
        }

        if(temp==null && carry>0){
            ansTail.next=new ListNode(carry);
        }

        // step 3 -> Reverse the LL Again

        head=reverse(head);

        return head;

    }
}