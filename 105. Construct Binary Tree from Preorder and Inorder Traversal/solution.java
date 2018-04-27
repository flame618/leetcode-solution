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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return getTree(preorder, inorder, 0, 0, inorder.length - 1);
    }
    private TreeNode getTree(int[] pre, int[] in, int preStart, int inStart, int inEnd)
    {
        if(preStart > pre.length - 1 || inStart > inEnd) return null;
        TreeNode root = new TreeNode(pre[preStart]);
        int index = 0;
        for(int i = inStart; i <= inEnd; i++)
        {
            if(in[i] == pre[preStart]) index = i;
        }
        root.left = getTree(pre, in, preStart + 1, inStart, index - 1);
        root.right = getTree(pre, in, preStart + index - inStart + 1, index + 1, inEnd);
        return root;
    }
}
