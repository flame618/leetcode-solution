/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        ListNode slow = head, fast = head, preSlow = null;
        while(fast != null && fast.next != null)
        {
            preSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        } 
        TreeNode root = new TreeNode(slow.val);
        fast = slow.next;
        if(preSlow == null) head = null;
        else preSlow.next = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(fast);
        return root;
    }
}
