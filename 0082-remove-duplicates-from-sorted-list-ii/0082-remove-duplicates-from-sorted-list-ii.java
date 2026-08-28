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

        while(head!=null && head.next!=null && head.val==head.next.val){
            int val=head.val;

            while(head != null && head.val==val){
                head=head.next;
            }
        }

        if(head==null || head.next == null ) return head;
        ListNode prev=head;
        ListNode curr=head.next;
        ListNode tmp=head.next.next;

        

        while(curr!=null && tmp!=null && prev!=null){
            if(curr.val==tmp.val){

               while( tmp!=null && curr.val==tmp.val ){
                tmp=tmp.next;
               }
               prev.next=tmp;
               curr=tmp;

               if(tmp!=null){
                tmp=tmp.next;
               }

            }
            else{
                curr=curr.next;
                prev=prev.next;

                if(curr!=null){
                    tmp=curr.next;
                }
            }
        }
        return head;
    }

}