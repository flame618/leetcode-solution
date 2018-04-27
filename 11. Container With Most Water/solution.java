class Solution {
    /*
    public int maxArea(int[] height) {
        int length = height.length;
        if(length < 1) return 0;
        int[] dp = new int[length];
        dp[0] = 0;
        for(int i = 1; i < length; i++)
        {
            int temp = 0;
            for(int j = 0; j < i; j++)
            {
                int h = Math.min(height[i], height[j]);
                int w = i - j;
                temp = Math.max(temp, h * w);
            }
            dp[i] = Math.max(dp[i - 1], temp);
        }
        return dp[length - 1];
    }
    */
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int res = 0;
        while(i < j)
        {
            res = Math.max(res, (j - i) * Math.min(height[i], height[j]));
            if(height[i] >= height[j]) j--;
            else i++;
        }
        return res;
    }
}
