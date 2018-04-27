/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        Stack<Integer> stack = new Stack<>();
        while(fast != null && fast.next != null)
        {
            stack.push(slow.val);
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast != null) //为奇数个，此时slow在正中间位置
        {
            slow = slow.next; 
        }
        while(slow != null)
        {
            if(stack.empty() || stack.pop() != slow.val)
            return false;
            slow = slow.next;
        }
        return true;
    }
}
