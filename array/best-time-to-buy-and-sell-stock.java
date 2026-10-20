class Solution {
    public int maxProfit(int[] prices) {
        int curr_profit = prices[0];
        int max_profit = 0;
        for (int i =1;i< prices.length;i++){
            if (prices[i] < curr_profit){
                curr_profit = prices[i];
            }
            int profit = prices[i] - curr_profit;
            if (profit > max_profit){
                max_profit = profit;
            }
        
        }
        return max_profit;
        }
    }
