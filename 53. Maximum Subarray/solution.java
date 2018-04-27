class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0], res = max;
        for(int i = 1; i < nums.length; i++)
        {
            max = Math.max(max + nums[i], nums[i]);//代表着以第i个元素结尾的时候的最大和，如果前面积累的最大和加上第i个元素比该元素小，前面的就是累赘，直接丢掉，从第i个开始.
            res = Math.max(max, res);
        }
        return res;
    }
}
