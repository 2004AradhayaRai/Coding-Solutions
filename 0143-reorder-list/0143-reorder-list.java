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

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;

        ListNode curr=mid.next;
        ListNode next=null;
        ListNode prev=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        } 
        mid.next=null;

        ListNode left=head;
        ListNode right=prev;

        while(right!=null){
           ListNode tmp=left.next;
           ListNode tmp2=right.next;
           left.next=right;
           right.next=tmp;

           left=tmp;
           right=tmp2;
        }

    }
}