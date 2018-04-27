/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode oddHead = head, even = new ListNode(-1), evenHead = even, pre = null;
        while(head != null && head.next != null)
        {
            pre = head;
            even.next = head.next;
            head.next = head.next.next;
            head = head.next;
            even = even.next;
        }
        if(head == null) head = pre;
        if(even != null) even.next = null;
        head.next = evenHead.next;
        return oddHead;
    }
}
