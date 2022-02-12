package com.DP;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int res =0,min=prices[0];
        for(int i=1;i<prices.length;i++){
            min=Math.min(min,prices[i-1]);
            int diff= prices[i]-min;
            if(diff>res)
                res=diff;
        }

        return res;
    }
}
