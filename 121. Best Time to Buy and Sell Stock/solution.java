class Solution {
    public int maxProfit(int[] prices) {
        int res = 0, minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < minPrice) minPrice = prices[i];
            else if(prices[i] - minPrice > res) res = prices[i] - minPrice;
        }
        return res;
    }
}
