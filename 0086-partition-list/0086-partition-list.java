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
    public ListNode partition(ListNode head, int x) {
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = head;
        ListNode cur = dummyNode;
        int size=0;
        while(temp !=null) {
            temp=temp.next;
            size++;
        }
        temp = head;
        for(int i=1;i<=size;i++) {
            if(temp.val<x) {
                ListNode newnode = new ListNode(temp.val);
                cur.next = newnode;
                cur = newnode;
            }
            temp = temp.next;
        }
        temp = head;
        for(int i=1;i<=size;i++) {
            if(temp.val>=x) {
                ListNode newnode = new ListNode(temp.val);
                cur.next = newnode;
                cur = newnode;
            }
            temp = temp.next;
        }
        return dummyNode.next;
    }
}