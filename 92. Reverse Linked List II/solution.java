/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == n || head == null || head.next == null) return head;
        ListNode pre = null;
        int i = 1;
        ListNode front = null, back = null, cback = null, head1 = head;
        while(head != null)
        {
            if(i <= n && i >= m)
            {
                if(i == m)
                {
                    front = pre;
                    cback = head;
                }
                else if(i == n)
                {
                    back = head.next;
                }
                ListNode next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }
            else if(i > n)
            {
                break;
            }
            else
            {
                pre = head;
                head = head.next;
            }
            i++;
        }
        if(front == null && head == null) return pre;
        else if(front != null && head == null) 
        {
            front.next = pre;
            cback.next = null;
            return head1;
        }
        else if(front == null && head != null)
        {
            cback.next = back;
            return pre;
        }
        else
        {
            front.next = pre;
            cback.next = back;
            return head1;
        }
    }
}
