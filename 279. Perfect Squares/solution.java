class Solution {
    public int numSquares(int n) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i * i <= n; i++) arr.add(i * i);
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i < arr.size(); i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(j >= arr.get(i))
                dp[j] = Math.min(dp[j], dp[j - arr.get(i)] + 1);
            }
        }
        return dp[n];
    }
}
