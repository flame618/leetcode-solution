/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode(-1), small = smallHead , bigHead = new ListNode(-1), big = bigHead;
        while(head != null)
        {
            if(head.val < x)
            {
                small.next = head;
                small = small.next;
            }
            else
            {
                big.next = head;
                big = big.next;
            }
            head = head.next;
        }
        small.next = bigHead.next;
        big.next = null;
        return smallHead.next;
    }
}
