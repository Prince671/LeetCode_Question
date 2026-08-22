class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> values = new HashSet<>();

        for(int val : nums) {
            values.add(val);
        }
        ListNode dummy=new ListNode(-1);        
        ListNode prev=dummy;
        ListNode current=head;
        dummy.next=current;
        while(current!=null){
            ListNode forward=current.next;
            if(values.contains(current.val)){
                prev.next=forward;
                current.next=null;
                current=forward;
            }
            else{
            prev = current;
                current = current.next;
            }
        }
        return dummy.next;
    }
}