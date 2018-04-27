/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode re = new ListNode(-1);
        re.next = head;
        ListNode re1 = re;
        while(head != null)
        {
            if(head.val == val)
            {
                re.next = head.next;
            }
            else
            {
                re = head;
            }
            head = head.next;
        }
        return re1.next;
    }
}
