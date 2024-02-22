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
    public ListNode deleteMiddle(ListNode head) {
       if(head==null || head.next==null){
           return null;
       }
        ListNode cur = head;
        ListNode fast = head;
        ListNode prev = head;
        while(fast!=null&&fast.next!=null){
            prev = cur;
            cur=cur.next;
            fast=fast.next.next;
        }
        prev.next=cur.next;
        return head;
    }
}