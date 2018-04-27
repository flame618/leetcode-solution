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
    /*
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    
    private int getHeight(TreeNode root)
    {
        if(root == null) return 0;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1; 
    }
    */
    public boolean isBalanced(TreeNode root) 
    {
        return getHeight(root) != -1;
    }
    private int getHeight(TreeNode root)
    {
        if(root == null) return 0;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if(left == -1 || right == - 1) return -1;
        if(Math.abs(left - right) > 1) return -1;
        return Math.max(left, right) + 1;
    }
}
