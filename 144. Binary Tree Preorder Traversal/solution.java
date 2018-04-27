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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty())
        {
            TreeNode cur = stack.pop();
            if(cur != null)
            {
                res.add(cur.val);
                stack.push(cur.right);
                stack.push(cur.left);
            }
        }
        return res;
    }
}
