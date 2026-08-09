class Solution {
    public int maxProfit(int[] prices) {
        int temp = Integer.MAX_VALUE;
        int res =0;
        for(int i =0; i < prices.length-1; i++){
            if(temp >= prices[i]){ // 1  >= 5 false
                temp = prices[i]; // temp = 1
            }
            if(temp >= prices[i+1]){ // 1 >= 6
                temp = prices[i+1];// temp = 1 
            }else{
                res = Math.max(prices[i+1] - temp, res); // 6 -1 = 5
            }
        }
        return res;
    }
}
