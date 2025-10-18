package LeetcodeAnswers.ArrayProblems;

public class BestTimeToBuyAndSellStockIII123 {

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit1 = 0;
        int sellDayIndex = 0;
        for(int i = 1; i < prices.length-1; i++) {
            if(min > prices[i]) {
                min = prices[i];
            }else{
                maxProfit1 = Math.max(maxProfit1, prices[i] - min);
                if(maxProfit1 == prices[i] - min) sellDayIndex = i;
            }
        }

        int maxProfit2 = 0;
        int min2 = prices[sellDayIndex];
        for(int j = sellDayIndex+1; j < prices.length; j++){
            if(min2 > prices[j]) {
                min2 = prices[j];
            }else{
                maxProfit2 = Math.max(maxProfit2, prices[j] - min2);
            }
        }

        return maxProfit2+maxProfit1;
    }
}
