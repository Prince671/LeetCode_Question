class Solution {
    public ListNode insertionSortList(ListNode head) {

        List<Integer> a = new ArrayList<>();

        ListNode current = head;

        while (current != null) {
            a.add(current.val);
            current = current.next;
        }

        Collections.sort(a);

        ListNode temp = head;
        int i = 0;

        while (temp != null) {
            temp.val = a.get(i);
            temp = temp.next;
            i++;
        }

        return head;
    }
}