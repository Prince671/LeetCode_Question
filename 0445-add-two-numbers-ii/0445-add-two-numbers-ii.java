
class Solution {
    static ListNode reverse(ListNode curr, ListNode prev) {
        if (curr == null) {
            return prev;
        }

        ListNode forward = curr.next;
        curr.next = prev;

        return reverse(forward, curr);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1, null);
        l2 = reverse(l2, null);

        ListNode dummy = new ListNode(-1);
        ListNode ansTail = dummy;

        ListNode temp = l1;
        ListNode temp2 = l2;
        int carry = 0;

        while (temp != null || temp2 != null) {
            int sum = carry;

            if (temp != null) {
                sum += temp.val;
                temp = temp.next;
            }

            if (temp2 != null) {
                sum += temp2.val;
                temp2 = temp2.next;
            }

            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            ansTail.next = newNode;
            ansTail = newNode;
        }

        if (carry > 0) {
            ansTail.next = new ListNode(carry);
        }

        return reverse(dummy.next, null);
    }
}
