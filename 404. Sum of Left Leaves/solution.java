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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        sum(root, false);
        return sum;
    }
    private void sum(TreeNode root, boolean left)
    {
        if(root == null) return;
        if(root.left == null && root.right == null && left) sum += root.val;
        sum(root.left, true);
        sum(root.right, false);
    }
}
