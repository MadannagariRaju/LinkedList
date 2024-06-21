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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer>al = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null) {
            al.add(temp.val);
            temp=temp.next;
        }
        int sum =0,j=0;
        for(int i=al.size()-1;i>=0;i--) {
            sum += (al.get(i)*Math.pow(2,j));
            System.out.println(sum);
            j++;
        }
        return sum;
    }
}