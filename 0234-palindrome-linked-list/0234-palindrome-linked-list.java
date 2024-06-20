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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int size=0;
        Stack<Integer>st = new Stack<>();
        while(temp !=null) {
            st.push(temp.val);
            temp=temp.next;
            size++;
        }
        temp = head;
        for(int i=0;i<size/2;i++) {
            int data=st.pop();
            if(temp.val != data) return false;
            temp = temp.next;
        }
        return true;

        
    }
}