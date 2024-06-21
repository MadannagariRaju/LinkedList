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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int size=0;
        while(temp!= null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        size = (size/2)+1;
        for(int i=1;i<size;i++) {
            temp = temp.next;
        }
        return temp;
    }
}