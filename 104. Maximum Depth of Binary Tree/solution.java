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
    private int maxNum;
    public int maxDepth(TreeNode root) {
        maxNum = 0;
        DFS(root, 0);
        return maxNum;
    }
    private void DFS(TreeNode root, int deepth)
    {
        if(root == null)
        {
            maxNum = Math.max(maxNum, deepth);
        }
        else
        {
            DFS(root.left, deepth + 1);
            DFS(root.right, deepth + 1);
        }
    }
}
