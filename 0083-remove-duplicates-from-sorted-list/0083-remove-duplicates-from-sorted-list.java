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
    public ListNode deleteDuplicates(ListNode head) {
       /* ListNode dummyNode = new ListNode(-1);
        ListNode cur = dummyNode;
        List<Integer>al = new ArrayList<>();
        ListNode temp = head;

        while(temp!=null) {
            if(!al.contains(temp.val)){
                al.add(temp.val);
            }
            temp = temp.next;
        }
        
        for(Integer e:al) {
            ListNode newnode = new ListNode(e);
            cur.next = newnode;
            cur = newnode;
        }
        return dummyNode.next; */

        if(head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        ListNode dummyNode = new ListNode(-1123);
        ListNode cur=dummyNode;

        while(temp!=null) {
            if(cur.val != temp.val) {
                ListNode newnode = new ListNode(temp.val);
                cur.next = newnode;
                cur = newnode;
            }
                temp = temp.next;
        }
        return dummyNode.next;
    }
}