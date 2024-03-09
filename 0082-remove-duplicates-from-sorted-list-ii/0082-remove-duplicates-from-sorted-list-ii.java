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
        if(head==null || head.next==null)return head;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        while(head!=null){
            map.compute(head.val,(k,v)->v==null?1:++v);
            head=head.next;
        }
        ListNode list = new ListNode(0);
        ListNode cur = list;
        for(int a : map.keySet()){
            if(map.get(a)==1){
                cur.next = new ListNode(a);
                cur=cur.next;
            }
        }
        return list.next;
    }
}