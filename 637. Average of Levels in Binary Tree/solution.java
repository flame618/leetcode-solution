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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int count = 0;
            long sum = 0;
            Queue<TreeNode> temp = new LinkedList<>();
            while(!queue.isEmpty())
            {
                TreeNode curNode = queue.remove();
                sum += curNode.val;
                count++;
                if(curNode.left != null) temp.add(curNode.left);
                if(curNode.right != null) temp.add(curNode.right);
            }
            res.add(sum * 1.0 / count);
            queue.addAll(temp);
        }
        return res;
    }
}
