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
    public TreeNode pruneTree(TreeNode root) {
        if(root == null || isAllZero(root)) return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        return root;
    }
    private boolean isAllZero(TreeNode root)
    {
        if(root == null) return true;
        return root.val == 0 && isAllZero(root.left) && isAllZero(root.right);
    }
}
