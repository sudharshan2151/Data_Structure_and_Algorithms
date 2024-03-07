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
            int val =check(cur.val,cur.next.val);
            ListNode divisor = new ListNode(val);
            ListNode temp = cur.next;
            cur.next=divisor;
            cur.next.next=temp;
            cur=cur.next.next;
        }
        return head;
    }
    int check(int a ,int b){
        int n =Math.min(a,b);
        int i=1;
        int result =1;
        while(i<=n){
            if(a%i==0&&b%i==0){
                result=Math.max(result,i);
            }
            i++;
        }
        return result;
    }
}