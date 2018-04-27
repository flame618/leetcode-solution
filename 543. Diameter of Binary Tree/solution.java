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
    int max = 1;
    public int diameterOfBinaryTree(TreeNode root) {
        getLength(root);
        return max - 1;
    }
    private int getLength(TreeNode root)
    {
        if(root == null) return 0;
        int left = getLength(root.left);
        int right = getLength(root.right);
        max = Math.max(max, 1 + left + right);
        return 1 + Math.max(left, right);
    }
}
