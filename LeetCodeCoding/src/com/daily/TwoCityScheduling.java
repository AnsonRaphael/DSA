package com.daily;

import java.util.Arrays;

public class TwoCityScheduling {
    public static void main(String[] args) {
        int[][]costs = {{10,20},{30,200},{400,50},{30,20}};
        System.out.println(twoCitySchedCost(costs));
    }

    public static int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(int[]a,int[]b)->{
            int i = Math.abs(a[0] - a[1]) - Math.abs(b[0] - b[1]);
            return i;
        });
        int lef=0,rg=0,cost=0;
        for (int i = costs.length-1; i >=0 ; i--) {
            if(rg==costs.length/2){
                cost+=costs[i][0];

            }else if(lef==costs.length/2){
                cost+=costs[i][1];

            }else {
                if(costs[i][0]>costs[i][1]){
                    cost+=costs[i][1];
                    rg++;
                }else if(costs[i][0]<costs[i][1]) {
                    cost+=costs[i][0];
                    lef++;
                }else {
                    cost+=costs[i][1];

                }
            }

        }
        return cost;
    }
}
