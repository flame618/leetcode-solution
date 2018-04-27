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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        getPathSum(root, sum, res, new ArrayList<Integer>());
        return res;
    }
    private void getPathSum(TreeNode root, int sum, List<List<Integer>> res, List<Integer> solution)
    {
        if(root == null) return;
        if(root.left == null && root.right == null && root.val == sum)
        {
            solution.add(root.val);
            res.add(new ArrayList<>(solution));
            solution.remove(solution.size() - 1);
            return;
        }
        solution.add(root.val);
        getPathSum(root.left, sum - root.val, res, solution);
        getPathSum(root.right, sum - root.val, res, solution);
        solution.remove(solution.size() - 1);
    }
}
