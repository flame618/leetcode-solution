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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        getPaths(root, res, new StringBuilder());
        return res;
    }
    private void getPaths(TreeNode root, List<String> res, StringBuilder str)
    {
        if(root == null) return;
        int l = str.length();
        String temp = "->" + root.val;
        str.append(temp);
        if(root.left == null && root.right == null) res.add(str.substring(2));
        getPaths(root.left, res, str);
        getPaths(root.right, res, str);
        str.delete(l, str.length());
    }
}
