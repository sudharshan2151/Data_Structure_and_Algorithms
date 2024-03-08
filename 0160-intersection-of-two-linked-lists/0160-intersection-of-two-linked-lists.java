/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count1 = count(headA);
        int count2 = count(headB);
        int gap ;
        
        if(count1>count2){
            gap=count1-count2;
        }
        else {
            ListNode temp = headA;
            headA=headB;
            headB=temp;
            gap=count2-count1;
        }
        
        while(gap-->0){
            headA=headA.next;
        }
        while(headA!=null&&headB!=null){
            if(headA==headB)return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }

    int count(ListNode headA){
        int count = 0;
            while(headA!=null){
                headA=headA.next;
                count++;
            }
        return count;
    }
}