package com.DP;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] costIndex= new int[cost.length+3];
        if(cost.length==1)
            return 0;
        if(cost.length==2)
            return Math.min(cost[1],cost[0]);
        costIndex[0]=0;
        costIndex[1]=0;
        costIndex[2]=Math.min(cost[1],cost[0]);

        for(int i=3;i<=cost.length;i++){
            costIndex[i]=Math.min(costIndex[i-2]+cost[i-2],costIndex[i-1]+cost[i-1]);
        }

        return costIndex[cost.length];
    }
}
