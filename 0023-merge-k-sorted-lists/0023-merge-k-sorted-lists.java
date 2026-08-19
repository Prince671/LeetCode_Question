class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        ArrayList<Integer> values = new ArrayList<>();

        for(int i = 0; i < lists.length; i++) {

            ListNode current = lists[i];

            while(current != null) {
                values.add(current.val);
                current = current.next;
            }
        }

        Collections.sort(values);

        if(values.size() == 0) {
            return null;
        }

        ListNode head = new ListNode(values.get(0));
        ListNode current = head;

        for(int i = 1; i < values.size(); i++) {

            ListNode nextNode = new ListNode(values.get(i));

            current.next = nextNode;
            current = current.next;
        }

        return head;
    }
}