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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // l1 = rev(l1);
        // l2 =  rev(l2);
        ListNode temp = null;
        ListNode ans = temp;
        int carry = 0;
        while(l1!=null || l2!=null){
            int sum = carry;
            if(l2==null){
                sum+=l1.val;
                l1=l1.next;
            }
            else if(l1==null){
                sum+=l2.val;
                l2=l2.next;
            }
            else{
                sum+=l2.val+l1.val;
                l1=l1.next;
                l2=l2.next;
            }
            //System.out.println(sum);
            carry = sum%10;
            int ele = sum/10;
            if(temp==null){
                ans = new ListNode(carry);
                temp = ans;
            }else{
                ans.next = new ListNode(carry);
                ans=ans.next;
            }
            System.out.println(temp.val);
            
            carry=ele;
            
        }
        if(carry!=0){
            ans.next=new ListNode(carry);
            ans=ans.next;
        }
        rev(ans);
        
        return temp;
    }

    ListNode rev(ListNode head){
       
       ListNode cur = head;
        ListNode prev = null;
        ListNode next = null;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur=next;
        }
        //head = prev;
        //System.out.println(prev);
        return prev;
    }
}