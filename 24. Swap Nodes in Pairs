/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode pre = new ListNode(-1), temp = head, temp1;
        pre.next = head;
        ListNode newHead = pre;
        while(temp != null && temp.next != null)
        {
            temp1 = temp.next;
            temp.next = temp1.next;
            temp1.next = temp;
            pre.next = temp1;
            pre = temp;
            temp = temp.next;
        }
        return newHead.next;
    }
}
