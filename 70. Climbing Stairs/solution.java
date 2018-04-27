class Solution {
    /*
    private Map<Integer, Integer> map;
    public int climbStairs(int n) {
        map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        return count(n, 0);
    }
    private int count(int n, int i)
    {
        if(i >= n) return 0;
        if(map.containsKey(n - i)) return map.get(n - i);
        int counts = count(n, i + 1) + count(n, i + 2);
        map.put(n - i, counts);
        return counts;
    }
    */
    public int climbStairs(int n)
    {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++)
        {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
