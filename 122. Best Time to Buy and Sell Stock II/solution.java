class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if(length == 0) return 0;
        int[] Y = new int[length];
        int[] N = new int[length];
        Y[0] = -prices[0];
        N[0] = 0;
        for(int i = 1; i < length; i++)
        {
            Y[i] = Math.max(N[i - 1] - prices[i], Y[i - 1]);
            N[i] = Math.max(Y[i - 1] + prices[i], N[i - 1]);
        }
        return N[length - 1];
    }
}
