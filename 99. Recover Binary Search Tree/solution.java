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
    private TreeNode pre;
    private TreeNode first = null, second = null;
    public void recoverTree(TreeNode root) {
        pre = new TreeNode(Integer.MIN_VALUE);
        traverse(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    private void traverse(TreeNode root)
    {
        if(root != null)
        {
            traverse(root.left);
            if(first == null && pre.val > root.val) first = pre;
            if(first != null && pre.val > root.val) second = root;
            pre = root;
            traverse(root.right);
        }
    }
}
