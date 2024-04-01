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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
         ListNode cur  = list1;
        int rem  = a;
        while(a-->1){
            cur=cur.next;
           
        }
        
        ListNode temp  =cur.next;
        cur.next=list2;
        
        while(rem<=b){
            temp=temp.next;
            rem++;
        }
        while(cur.next!=null){
             cur=cur.next;
        }
        cur.next=temp;
        return list1;
    }
}