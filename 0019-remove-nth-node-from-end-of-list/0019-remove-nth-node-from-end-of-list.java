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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next ==null && n==1){
            head = null;
            return head;
        }
        if(head.next ==null && n==0) return head;
        if(head == null) return head;
        ListNode temp = head;
        int size=0;
        while(temp!= null) {
            size++;
            temp = temp.next;
        }
        int pos = size-n;
        if(pos ==0) {
            return head.next;
        }
        temp =head;
        ListNode stemp = head;
        for(int i=0;i<pos;i++) {
            stemp = temp;
            temp=temp.next;
        }
        System.out.println(stemp.val);
        if(stemp.next !=null) {
            stemp.next = stemp.next.next;
        }
        else {
            stemp.next = stemp.next;
        }
        System.out.println(stemp.val);

        return head;
    }
}