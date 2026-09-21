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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans =new ListNode[k];
        //calculate the lenght of the LL
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        
        // calculating the baseSize and remaining element 
        int baseSize=len/k;
        int extraElement=len%k;

        ListNode prev=null;
        ListNode curr=head;

        for(int parts=0; parts<k; parts++){
            if(curr==null){
                ans[parts]=curr;
                continue;
            }

            ans[parts]=curr;

            int sizeOfSubList=baseSize+(extraElement>0?1:0);
            extraElement--;

            for(int i=1; i<=sizeOfSubList; i++){
                prev=curr;
                curr=curr.next;
            }
            prev.next=null;

            prev=null;
        }

        return ans;
    }
}