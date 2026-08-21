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
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }
        ArrayList<Integer> values=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            values.add(temp.val);
            temp=temp.next;
        }
        
    HashMap<Integer, Integer> map=new HashMap<>();
       for(int val:values){
         map.put(val, map.getOrDefault(val, 0) + 1);
       }
       values.clear();
      for(int val : map.keySet()){
        if(map.get(val)==1){
          values.add(val);
        }
      }
      Collections.sort(values);
      ListNode dummy=new ListNode(0);
      ListNode current=dummy;
      for(int val:values){
        current.next=new ListNode(val);
        current=current.next;
      }

      return dummy.next;
    }
}