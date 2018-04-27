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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root != null) q.add(root);
        while(!q.isEmpty())
        {
            Queue<TreeNode> temp = new LinkedList<>();
            List<Integer> arr = new ArrayList<>();
            while(!q.isEmpty())
            {
                TreeNode cur = q.remove();
                arr.add(cur.val);
                if(cur.left != null) temp.add(cur.left);
                if(cur.right != null) temp.add(cur.right);
            }
            res.add(arr);
            q.addAll(temp);
        }
        return res;
    }
}
