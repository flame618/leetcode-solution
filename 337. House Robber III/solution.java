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
    public int rob(TreeNode root) {
        Map<TreeNode, Integer> map = new HashMap<>();
        return subRob(root, map);
    }
    private int subRob(TreeNode root, Map<TreeNode, Integer> map)
    {
        if(root == null) return 0;
        if(map.containsKey(root)) return map.get(root);
        int val = root.val;
        if(root.left != null) val += subRob(root.left.left, map) + subRob(root.left.right, map);
        if(root.right != null) val += subRob(root.right.left, map) + subRob(root.right.right, map);
        val = Math.max(val, subRob(root.left, map) + subRob(root.right, map));
        map.put(root, val);
        return val;
    }
    */
    public int rob(TreeNode root) {
        int[] res = subRob(root);
        return Math.max(res[0], res[1]);    //比较root节点选与不选哪个对应的值大
    }
    private int[] subRob(TreeNode root)
    {
        if(root == null) return new int[2];
        int[] left = subRob(root.left); //left保存着左节点选与不选对应的值
        int[] right = subRob(root.right);   //right保存着右节点选与不选对应的值
        int[] res = new int[2]; 
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);//代表不选当前节点，那就直接判断下层节点选与不选的最大值
        res[1] = root.val + left[0] + right[0]; //代表选择当前节点，下层节点都不能选，直接确定了当前值
        return res;
    }
}
