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
        Stack<Integer>LL1 = new Stack<>();
        Stack<Integer>LL2 = new Stack<>();
        Stack<Integer>result = new Stack<>();
        ListNode t1 =l1;
        ListNode t2 =l2;
        while(t1 != null) {
            LL1.push(t1.val);
            t1= t1.next;
        }
        while(t2 != null) {
            LL2.push(t2.val);
            t2= t2.next;
        }
        int sum=0,carry=0;
        ListNode dummyNode = new ListNode(-1);
        ListNode cur = dummyNode;
        while(!LL1.isEmpty() || !LL2.isEmpty()) {
            sum =carry;
            if(!LL1.isEmpty()) sum += LL1.pop();
            if(!LL2.isEmpty()) sum += LL2.pop();
            result.push(sum%10);
            carry = sum/10;
        }
        if(carry >0) {
            result.push(carry);
        }

        while(!result.isEmpty()) {
            ListNode newnode = new ListNode(result.pop());
            cur.next =newnode;
            cur =newnode;
        }
        return dummyNode.next;
    }
}