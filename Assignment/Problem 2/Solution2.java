class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) { return 0;}
        int first_buy = Integer.MAX_VALUE, second_buy = Integer.MAX_VALUE;
        int first_sell = 0, second_sell = 0;
        int n = prices.length;
        
        for(int i = 0; i < n; i++) {
            first_buy = Math.min(first_buy, prices[i]);
            first_sell = Math.max(first_sell, prices[i] - first_buy);
            second_buy = Math.min(second_buy, prices[i] - first_sell);
            second_sell = Math.max(second_sell, prices[i] - second_buy);
        }
        
        return second_sell;
    }
}