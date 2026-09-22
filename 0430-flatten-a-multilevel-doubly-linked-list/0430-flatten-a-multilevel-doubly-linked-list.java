/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.child!=null){
               Node findLastChildNode=temp.child;
               while(findLastChildNode.next!=null){
                findLastChildNode=findLastChildNode.next;
               }
               findLastChildNode.next=temp.next;
               if(temp.next!=null){
               temp.next.prev=findLastChildNode;
               }
               temp.next=temp.child;
               temp.next.prev=temp;
               temp.child=null;
            }
            temp=temp.next;
        }
        return head;
    }
}