/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode re = new ListNode(Integer.MIN_VALUE);
        while(head != null)
        {
            ListNode pre = re;
            while(pre != null)
            {
                if(head.val >= pre.val && (pre.next == null || head.val <= pre.next.val))    //位置正确
                {
                    ListNode next = pre.next;
                    pre.next = head;
                    ListNode headNext = head.next;
                    head.next = next;
                    head = headNext;
                    break;
                }
                pre = pre.next;
            }
        }
        return re.next;
    }
}
