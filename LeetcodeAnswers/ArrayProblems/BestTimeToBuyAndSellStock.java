package LeetcodeAnswers.ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices){

        //List<Integer> dp = new ArrayList<>();
        int maxProfit=0;

        int minPrice = prices[0];

        for(int i = 1; i < prices.length; i++){
            if(minPrice < prices[i]){
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }else{
                minPrice = prices[i];
            }
        }

        return maxProfit;

//        this code is worng because it has o(n^2) complexity, large array test cases were failed because of this, so we have to find o(n) or less solution which has less complexity that o(n^2)
//        int max = 0;
//        int right;
//
//        for(int i = 0; i < prices.length - 1; i++){
//            right = prices.length -1 ;
//            while (i < right){
//                if(prices[i]<prices[right]){
//                    int profit = prices[right]-prices[i];
//                    dp.add(profit);
//                }
//                right--;
//            }
//        }
//
//        for(int i : dp){
//            max = Math.max(max, i);
//        }
//
//        return max;

    }
}
