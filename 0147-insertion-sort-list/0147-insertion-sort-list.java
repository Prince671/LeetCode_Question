class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode current=head;
        while(current!=null){
            ListNode minNode=current;
            ListNode compare=current.next;
            while(compare!=null){
                if(compare.val<minNode.val){
                    minNode=compare;
                }
                compare=compare.next;
            }
            int temp = current.val;
            current.val = minNode.val;
            minNode.val = temp;

            current=current.next;
        }


        return head;
    }
}