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
    public int getDecimalValue(ListNode head) {
        ListNode cur = reverse(head);
        int result = 0;
        int i =0;
        while(cur!=null){
            result+=(cur.val%10)*(int)Math.pow(2,i++);
            cur=cur.next;
        }
        return result;
    }
    
    ListNode reverse(ListNode head){
        ListNode cur = head;
        ListNode prev = null;
        ListNode next = null;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev  = cur;
            cur=next;
        }
        return prev;
    }
}