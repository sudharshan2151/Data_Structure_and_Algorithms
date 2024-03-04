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
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur = head;
        ListNode res1 = new ListNode(0);
        ListNode res = res1;
       while(cur!=null){
           if(cur.val!=val){
               res.next = new ListNode(cur.val);
               res=res.next;
           }
          cur=cur.next;
       }
        return res1.next;
    }
}