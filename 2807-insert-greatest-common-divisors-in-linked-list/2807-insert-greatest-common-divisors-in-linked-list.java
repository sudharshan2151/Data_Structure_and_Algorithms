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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        while(cur!=null&&cur.next!=null){
            int val =gcd(cur.val,cur.next.val);
            ListNode divisor = new ListNode(val);
            ListNode temp = cur.next;
            cur.next=divisor;
            cur.next.next=temp;
            cur=cur.next.next;
        }
        return head;
    }
    int gcd(int a ,int b){
        if(b==0){
            return a;
        }
        //System.out.println(a+" "+b);
      return gcd(b,a%b);
    }
}