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
        int count = 0;
        ListNode cur = head;
        while(cur!=null){
            cur = cur.next;
            count++;
        }
        count-=n;
        if(count==0){
            return head.next;
        }
        cur = head;
        ListNode prev = head;
        while(count!=0){
            count--;
            prev = cur;
            cur=cur.next;
        }
        prev.next = cur.next;
        return head;

    }
}