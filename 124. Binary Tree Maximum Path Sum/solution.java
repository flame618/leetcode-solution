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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int res = pathSum(root);
        return max;
    }
    private int pathSum(TreeNode root)  //函数的功能是返回从root节点出发向下的路径中（不一定要到叶子节点）节点相加最大的数值
    {
        if(root == null) return 0;
        int left = Math.max(pathSum(root.left), 0); //如果获取到的从左孩子节点开始向下的节点相加最大值小于0，则放弃左孩子向下相加，左边的和设置为0
        int right = Math.max(pathSum(root.right), 0);//同上
        max = Math.max(max, left + right + root.val);  //left和right都是大于等于0的，所以三个数相加必是最大的，表示以root节点为根节点的节点和最大值
        return root.val + Math.max(left, right);
    }
}
