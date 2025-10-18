package LeetcodeAnswers.ArrayProblems;

public class BestTimeToBuyAndSellStockII122 {
    public int maxProfit(int[] prices){

        int profit = 0;
        int length = prices.length;
        for(int i = 0; i < length-1; i++){
            if(prices[i]<prices[i+1]){
                profit += prices[i+1]-prices[i];
            }
        }
        return profit;
    }
}
