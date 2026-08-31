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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head==null || left==right) return head;

        ListNode curr=head;
        ListNode tmp=head;

        int leftcnt=1;
        int rightcnt=1;

        while(leftcnt!=left){
            tmp=tmp.next;
            leftcnt++;
        }
        ListNode leftNode=tmp;

        while(rightcnt!=right){
            curr=curr.next;
            rightcnt++;
        }
        ListNode rightNode = curr;

        ListNode before = head;
        if(left==1){
            before = null;
        }
        else{
            while(before.next!=leftNode){
                before=before.next;
            }
        }
        ListNode after=rightNode.next;
        ListNode prev=after;
        curr=leftNode;

        while(curr!=after){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        if(before!=null){
            before.next=rightNode;
        }
        else{
            head=rightNode;
        }
        return head;
    }
}