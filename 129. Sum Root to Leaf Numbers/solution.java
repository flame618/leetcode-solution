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
    private int totalSum;
    public int sumNumbers(TreeNode root) {
        totalSum = 0;
        getSum(root, 0);
        return totalSum;
    }
    public void getSum(TreeNode root, int num)
    {
        if(root == null) return;
        if(root.left == null && root.right == null)
        {
            num = num * 10 + root.val;
            totalSum += num;
        }
        int tempNum = num * 10 + root.val;
        getSum(root.left, tempNum);
        getSum(root.right, tempNum);
    }
}
