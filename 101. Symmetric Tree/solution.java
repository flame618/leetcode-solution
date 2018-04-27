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
    public boolean isSymmetric(TreeNode root) {
        return DFS(root,root);
    }
    private boolean DFS(TreeNode left, TreeNode right)
    {
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        return left.val == right.val && DFS(left.left, right.right) && DFS(left.right, right.left);
    }
}
