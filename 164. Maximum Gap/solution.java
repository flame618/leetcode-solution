class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i < nums.length - 1; i++)
        {
            int curGap = Math.abs(nums[i] - nums[i + 1]);
            ans = Math.max(ans, curGap);
        }
        return ans;
    }
}
