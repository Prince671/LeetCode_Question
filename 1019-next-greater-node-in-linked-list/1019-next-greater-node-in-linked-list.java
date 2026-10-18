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
        int index=0;
        ListNode temp=head;
        while(temp!=null){
            int val=temp.val;
            for(ListNode temp1=temp.next; temp1!=null; temp1=temp1.next){
                int val1=temp1.val;
                if(val1>val){
                    ans[index]=val1;
                    break;

                }
            }
            temp=temp.next;
            index++;
        }
        return ans;
    }
}