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
    TreeNode pre = null;
    boolean isValid = true;
    public boolean isValidBST(TreeNode root) {
        traverse(root);
        return isValid;
    }
    private void traverse(TreeNode root)
    {
        if(root == null) return;
        traverse(root.left);
        if(pre != null && pre.val >= root.val) isValid = false;
        pre = root;
        traverse(root.right);
    }
}
