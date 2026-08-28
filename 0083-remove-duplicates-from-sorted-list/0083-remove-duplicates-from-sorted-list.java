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
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null){
            return null;
        }

        ListNode tmp=head.next;
        ListNode curr=head;
        
        while(curr!=null && tmp!=null){
            if(curr.val == tmp.val){
                curr.next=tmp.next;
                tmp=curr.next;
            }
            else{
                curr=curr.next;
                tmp=tmp.next;
            }
        }
        return head;
    }
}