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
    public List<Integer> inorderTraversal(TreeNode root) {
        this.res = new ArrayList<>();
        traversal(root);
        return res;
    }
    private List<Integer> res;
    public void traversal(TreeNode root)
    {
        if(root != null)
        {
            traversal(root.left);
            res.add(root.val);
            traversal(root.right);
        }
    }
    */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(!stack.empty() || cur != null)
        {
            while(cur != null)
            {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
}
