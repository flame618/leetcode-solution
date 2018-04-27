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
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);//计算从任何一个节点开始寻找的可能的数量的总和
    }
    
    private int pathSumFrom(TreeNode root, int sum) //计算从某个节点root开始往下寻找连续的几个数使得和为sum的可能的种数
    {
        if(root == null) return 0;
        return (root.val == sum ? 1 : 0) + pathSumFrom(root.left, sum - root.val) + pathSumFrom(root.right, sum - root.val);
    }
}
