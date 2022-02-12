package com.DP;

public class BestSightseeingPair {
    public static void main(String[] args) {
        int[] values={2,2,2};
        System.out.println(maxScoreSightseeingPair(values));
    }
    public static int maxScoreSightseeingPair(int[] values) {
        int first=values[0]+0,max=Integer.MIN_VALUE;

        for (int i = 1; i < values.length; i++) {


            max=Math.max(max,values[i]-i+first);
            first=Math.max(first,values[i]+i);
        }
        return max;
    }
}
