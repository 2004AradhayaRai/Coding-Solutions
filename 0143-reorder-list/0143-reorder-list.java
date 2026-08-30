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
    public void reorderList(ListNode head) {

        if(head==null || head.next==null) {
            return ;
        }

        ListNode curr=head;

        while(curr!=null && curr.next!=null){
            ListNode prev=curr;
            ListNode tmp=curr.next;

            while(tmp.next!=null){
                prev=tmp;
                tmp=tmp.next;
            }
            prev.next=null;

            tmp.next=curr.next;
            curr.next=tmp;

            curr=tmp.next;

        }
    }
}