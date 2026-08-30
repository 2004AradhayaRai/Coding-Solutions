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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null || k == 0) return head;

        int cnt=1;

        ListNode curr= head;
        ListNode tmp=head;
        
        while(tmp.next!=null){
            tmp=tmp.next;
            cnt++;
        }

        tmp.next=curr;
        k=k%cnt;
        k=cnt-k;

        while(k>0){
            tmp=tmp.next;
            k--;
        }
        curr=tmp.next;
        tmp.next=null;
        return curr;

    }
}