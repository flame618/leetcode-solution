class Solution {
    /*
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for(int i = 0; i <= amount; i++)
        {
            dp[0][i] = (i % coins[0] == 0) ? i / coins[0] : -1;
        }
        for(int i = 1; i < n; i++)
        {
            for(int j = 0; j <= amount; j++)
            {
                int k = j / coins[i];
                int minNum = Integer.MAX_VALUE;
                for(int m = 0; m <= k; m++)
                {
                    if(dp[i - 1][j - m * coins[i]] == -1) continue;
                    minNum = Math.min(minNum, dp[i - 1][j - m * coins[i]] + m);
                }
               dp[i][j] = (minNum == Integer.MAX_VALUE) ? -1 : minNum;
            }
        }
        return dp[n - 1][amount];
    }
    */
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j <= amount; j++)
            {
                if(j >= coins[i])
                {
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
