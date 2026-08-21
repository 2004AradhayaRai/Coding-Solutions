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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode tmp=head;
        int size=0;

        while(tmp!=null){
            tmp=tmp.next;
            size++;
        }

        if(n==size) return head.next;

        ListNode curr=head;

        int iToRemove=size-n;
        int i=1;

        while(i<iToRemove){
            curr=curr.next;
            i++;
        }
        curr.next=curr.next.next;
        return head;
    }
}