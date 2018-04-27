class Solution {
    private int[] res;
    public int[] searchRange(int[] nums, int target) {
        res = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        search(nums, target, 0, nums.length - 1);
        if(res[1] < 0) return new int[]{-1, -1};
        else return res;
    }
    private void search(int[] nums, int target, int lo, int hi)
    {
        if(lo > hi) return;
        int mid = (lo + hi) / 2;
        if(nums[mid] == target)
        {
            res[1] = Math.max(res[1], mid);
            res[0] = Math.min(res[0], mid);
            search(nums, target, lo, mid - 1);
            search(nums, target, mid + 1, hi);
        }
        else if(target < nums[mid]) search(nums, target, lo, mid - 1);
        else search(nums, target, mid + 1, hi);
    }
}
