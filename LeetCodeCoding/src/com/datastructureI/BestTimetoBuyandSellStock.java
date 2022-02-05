package com.datastructureI;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int[] maxRight = new int[prices.length];
        int max=prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--){
            max=Math.max(prices[i+1],max);
            maxRight[i]=max;
        }
        int res=0;
        for(int i=0;i<prices.length-1;i++){
            int diff= maxRight[i]-prices[i];
            if(diff>res)
                res=diff;
        }


        return res;
    }
    public int maxProfit1(int[] prices) {
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
