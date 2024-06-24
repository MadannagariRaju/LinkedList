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
        /* ListNode temp = head;
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
        return true;   */

        /*
        1.Find out the middle Node
        2.reverse the second part
        3.compare the first and second part
         */
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next !=null && fast.next.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newhead  = reverse(slow.next);

        ListNode first = head;
        ListNode second = newhead;
        while(second != null) // second part last node points to null
        {
            if(first.val != second.val) {
                reverse(newhead);  // make the altered data to the original data
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverse(newhead);
        return true;
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        while(temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}