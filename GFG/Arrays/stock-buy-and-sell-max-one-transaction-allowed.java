class Solution {
    public int maxProfit(int[] prices) {
        int startT = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++){
            if(startT > prices[i]) startT = prices[i];
            else{
                int profit = prices[i] - startT;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}