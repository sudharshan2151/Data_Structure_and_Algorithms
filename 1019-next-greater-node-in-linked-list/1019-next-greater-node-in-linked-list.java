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
    public int[] nextLargerNodes(ListNode head) {
        
    Stack<Integer> stack  =new Stack<>();
        int n  =count(head);
        int[] ar = new int[n];
        int i=n-1;
        head  = reverse(head);
        ListNode cur = head;
        while(cur!=null){
            while(!stack.isEmpty()&&cur.val>=stack.peek()){
                stack.pop();
            }
            ar[i--]=stack.isEmpty()?0:stack.peek();
            stack.push(cur.val);
            cur=cur.next;
        }
        return ar;
    }
    
    ListNode reverse(ListNode head){
        ListNode cur = head;
        ListNode prev = null;
        ListNode next = null;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    
    int count(ListNode head){
        int count = 0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
}