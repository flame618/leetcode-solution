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
    private int minNum;
    public int minDepth(TreeNode root) {
        minNum = Integer.MAX_VALUE;
        if(root == null) return 0;
        DFS(root, 0);
        return minNum;
    }
    private void DFS(TreeNode root, int deepth)
    { 
        if(root.left == null && root.right == null) minNum = Math.min(minNum, deepth + 1);
        if(root.left != null) DFS(root.left, deepth + 1);
        if(root.right != null) DFS(root.right, deepth + 1);
    }
}
