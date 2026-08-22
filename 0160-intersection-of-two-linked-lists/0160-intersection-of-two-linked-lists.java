/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        //calculating the Length of Both the List
        while(a!=null && b!=null){
            a=a.next;
            b=b.next;
        }
        //calculating the extra length of the linkedlist and making it Same length , Both the linked list
        if(a!=null){
            int aExtraLen=0;
            while(a!=null){
                aExtraLen++;
                a=a.next;
            }
            while(aExtraLen>0){
                headA=headA.next;
                aExtraLen--;
            }
        }else{
            int bExtraLen=0;
            while(b!=null){
                bExtraLen++;
                b=b.next;
            }

            while(bExtraLen>0){
                headB=headB.next;
                bExtraLen--;
            }
        }

        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}