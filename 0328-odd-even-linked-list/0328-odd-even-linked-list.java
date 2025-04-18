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
    public ListNode oddEvenList(ListNode head) {
       /* ListNode dummyNode = new ListNode(-1);
        ListNode cur = dummyNode;
        ListNode temp = head;
        int size=0;
        while(temp!= null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        for(int i=1;i<=size;i++) {
            if(i%2 != 0) {
                ListNode newnode = new ListNode(temp.val);
                cur.next = newnode;
                cur = newnode;
            }
            temp=temp.next;
        }
        temp = head;
        for(int i=1;i<=size;i++) {
            if(i%2 == 0) {
                ListNode newnode = new ListNode(temp.val);
                cur.next = newnode;
                cur = newnode;
            }
            temp = temp.next;
        }
        return dummyNode.next; */

        if(head == null  || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenhead = head.next;

        while(even!=null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
        return head;
    }
}