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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null) {
            return head;
        }
        ListNode temp = head;
        ListNode tail = head;
        int size =1;
        while(tail.next != null) {
            size++;
            tail = tail.next;
        }
        if(size == k) {
            return head;
        }
        // System.out.println(size);
        int res = size -(k%size);
        // System.out.println(tail.val);
        tail.next = temp;
        // System.out.println(res);
        for(int i=1;i<res;i++) {
            temp = temp.next;
        }
        // System.out.println(temp.val);
        ListNode newnode = temp.next;
        temp.next = null;
        
        return newnode;

    }
}