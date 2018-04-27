/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int m = 0;
        ListNode head1 = head, re = new ListNode(-1);
        while(head != null)
        {
            if(m == k)
            {
                if(head.next != null)
                {
                    re.next = head.next;
                }
                else
                {
                    re.next = head1;
                }
            }
            head = head.next;
        }
    }
}
