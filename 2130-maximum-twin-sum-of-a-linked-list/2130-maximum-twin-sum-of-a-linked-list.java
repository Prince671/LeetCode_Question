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
    public int pairSum(ListNode head) {
        ArrayList<Integer> values=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            values.add(temp.val);
            temp=temp.next;
        }
        int i=0; 
        int j=values.size()-1;
        int twins=0;
        while(i<=j){
            twins=Math.max((values.get(i)+values.get(j)), twins);
            i++;
            j--;
        }
        return twins;
    }
}