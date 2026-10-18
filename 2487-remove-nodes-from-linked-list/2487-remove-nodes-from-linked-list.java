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
    public ListNode removeNodes(ListNode head) {
        List<Integer> list=new ArrayList<>();
        Deque<Integer> st= new ArrayDeque<>();
        ListNode ansTail=head;
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        for(int i=0; i<list.size(); i++){
            while(!st.isEmpty() && list.get(i)>st.peek()){
                st.pop();
            }
            st.push(list.get(i));
        }
        while(!st.isEmpty()){
            ListNode newNode=new ListNode(st.removeLast());
            ansTail.next=newNode;
            ansTail=ansTail.next;
        }
        return head.next;
    }
}