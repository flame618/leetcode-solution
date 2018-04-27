class Solution {
    public int maxProfit(int[] prices) {
        /*定义两个数组Y,N 
        其中Y[i]表示在第i天，是持股状态，是有股票的。分两种情况：
        1.当天刚买了股票,总收益为前天没有股票状态的收益（昨天休息一天）减去今天股票价格。2.昨天就有股票了，今天不操作，承接昨日收益。
        N[i]表示在第i天，是非持股状态，没有股票，同样也分两种情况：
        2.当天刚卖了股票，总收益为昨天持股状态的收益加上今天股票价格。2.昨天就没有股票，今天不操作。
        */
        int length = prices.length;
        if(length < 2) return 0;
        int[] Y = new int[length];
        int[] N = new int[length];
        Y[0] = -prices[0];
        N[0] = 0;
        Y[1] = Math.max(0 - prices[1], Y[0]);
        N[1] = Math.max(N[0], Y[0] + prices[1]);
        for(int i = 2; i < length; i++)
        {
            Y[i] = Math.max(N[i - 2] - prices[i], Y[i - 1]);
            N[i] = Math.max(Y[i - 1] + prices[i], N[i - 1]);
        }
        return N[length - 1];
    }
}
