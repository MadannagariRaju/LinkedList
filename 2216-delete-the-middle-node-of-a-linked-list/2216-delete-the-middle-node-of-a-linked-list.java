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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null) {
            return head;
        }
        if(head.next == null) {
            head = null;
            return head;
        }
        int size =0;
        ListNode temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        size = (size/2);
        System.out.println(size);
        temp = head;
        ListNode stemp = head;
        for(int i=0;i<size;i++) {
            stemp = temp;
            temp = temp.next;
        }
        stemp.next = stemp.next.next;
        System.out.println(stemp.val);
        return head;
        
    }
}