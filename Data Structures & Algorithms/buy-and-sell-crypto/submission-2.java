class Solution {
    public int maxProfit(int[] prices) {
        int l = 0 , r = prices.length -1, profit = 0;

        while(l <= r){
            if(prices[r]>prices[l]){
                profit = Math.max(prices[r]-prices[l], profit);
            }
            if(l < r){
                l++;
            }else{
                l = 0;
                r--;
            }
        }

        return profit;
    }
}
