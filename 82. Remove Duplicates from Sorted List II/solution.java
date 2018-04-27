/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        boolean flag = false;
        while(head != null && head.next != null && head.next.val == head.val)
        {
            head = head.next;
            flag = true;
        }  
        if(!flag) head.next = deleteDuplicates(head.next);
        else head = deleteDuplicates(head.next);
        return head;
    }
}
