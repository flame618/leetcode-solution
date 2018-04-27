class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        int res = 1;
        dp[0] = 1;  //dp[i] means 以第i个元素为结尾的递增序列的对应元素个数，比如2, 3, 4, 1的dp[0] ~ dp[3]的值分别为1,2,3,1
        for(int i = 1; i < nums.length; i++)
        {
            int maxtemp = 1;
            for(int j = 0; j < i; j++)
            {
                if(nums[i] > nums[j])
                    maxtemp = Math.max(maxtemp, dp[j] + 1);
            }
            dp[i] = maxtemp;
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
