/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode re = new ListNode(-1);
        ListNode re1 = re;
        int cab = 0;
        while(l1 != null || l2 != null)
        {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int sum = val1 + val2 + cab;
            cab = sum / 10;
            re.next = new ListNode(sum % 10);
            re = re.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if(cab == 1) re.next = new ListNode(1);
        return re1.next;
    }
}
