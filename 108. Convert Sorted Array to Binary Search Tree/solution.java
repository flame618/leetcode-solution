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
    public TreeNode sortedArrayToBST(int[] nums) {

        return getBST(nums, 0, nums.length - 1);

    }
    private TreeNode getBST(int[] nums, int left, int right)
    {
        if(left > right) return null;
        int mid = (right + left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = getBST(nums, left, mid - 1);
        root.right = getBST(nums,  mid + 1, right);
        return root;
    }
}
