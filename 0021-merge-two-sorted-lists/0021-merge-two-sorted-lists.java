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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 =list1;
        ListNode t2 = list2;
        ListNode dummyNode = new ListNode(-1);
        ListNode cur = dummyNode;

        if(t1 == null) return t2;
        if(t2 == null)  return t1;
        while(t1 != null && t2 != null) {
            if(t1.val <= t2.val) {
                cur.next=t1;
                cur=t1;
                t1=t1.next;
            }
            else if(t2.val <= t1.val) {
                cur.next= t2;
                cur=t2;
                t2= t2.next;
            }
        }
        while(t1 != null) {
            cur.next = t1;
            cur =t1;
            t1 = t1.next;
        }
        while(t2 != null) {
            cur.next = t2;
            cur =t2;
            t2 = t2.next;
        }

        return dummyNode.next;
    }
}