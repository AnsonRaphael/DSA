package com.DP;

public class BestTimetoBuyandSellStockII {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int bd=0,sd=0,max=0;
        for(int i=1;i<prices.length;i++){
            // if price increaseb
            if(prices[i]>=prices[i-1]){
                sd++;
            }else{
                max+=prices[sd]-prices[bd];
                sd=bd=i;
            }
        }
        max+=prices[sd]-prices[bd];
        return max;
    }
}
