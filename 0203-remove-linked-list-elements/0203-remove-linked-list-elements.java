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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ArrayList<Integer>al = new ArrayList<>();
        while(temp!=null) {
            if(temp.val != val) {
                al.add(temp.val);
            }
            temp =temp.next;
        }
        ListNode dummyNode = new ListNode(-1);
        ListNode cur = dummyNode;
        temp = head;
        for(int i=0;i<al.size();i++) {
                ListNode newnode = new ListNode(al.get(i));
                cur.next = newnode;
                cur = cur.next;
        }
        return dummyNode.next;
    }
}