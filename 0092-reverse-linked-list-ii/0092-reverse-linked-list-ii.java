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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> LL=new ArrayList<>();
        ListNode current=head;
        while(current!=null){
            LL.add(current.val);
            current=current.next;
        }
        int i=left-1;
        int j=right-1;
        while(i<=j){
            int temp=LL.get(i);
            LL.set(i, LL.get(j));
            LL.set(j, temp);
            i++;
            j--;
        }
        int index=0;
        ListNode pointingNode=head;
        while(pointingNode!=null){
            pointingNode.val=LL.get(index);
            index++;
            pointingNode=pointingNode.next;
        }
        return head;
    }
}