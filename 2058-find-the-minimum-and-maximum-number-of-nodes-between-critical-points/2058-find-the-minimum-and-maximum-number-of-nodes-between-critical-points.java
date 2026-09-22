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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null){
            return new int[]{-1,-1};
        }

        ListNode prev=head;
        ListNode current=head.next;
        int nodePosition=1;
        List<Integer> criticalPoint=new ArrayList<>();

        while(current!=null && current.next!=null){
            // finding the local Maxima
            if(current.val>prev.val && current.val>current.next.val){
                criticalPoint.add(nodePosition);
            }
            // finding the local Minima
            if(current.val<prev.val && current.val< current.next.val){
                criticalPoint.add(nodePosition);
            }
            current=current.next;
            prev=prev.next;
            nodePosition++;
        }

        if(criticalPoint.size()<2){
            return new int[]{-1, -1};
        }

        int minDist=Integer.MAX_VALUE;

        for(int i=1; i<criticalPoint.size(); i++){
            minDist=Math.min(minDist, criticalPoint.get(i)-criticalPoint.get(i-1));
        }

        int maxDist=criticalPoint.get(criticalPoint.size()-1)-criticalPoint.get(0);

        return new int[]{minDist, maxDist};
    }
}