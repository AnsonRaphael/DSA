package com.AlgorithmI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(2));
        triangle.add(List.of(3,4));
        triangle.add(List.of(6,5,7));
        triangle.add(List.of(4,1,8,3));
        System.out.println(minimumTotal(triangle));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        //dp
        int[] dp = new int[triangle.get(triangle.size()-1).size()];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            int[] dp1=new int[triangle.get(i).size()];
            Arrays.fill(dp1,Integer.MAX_VALUE);
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int prevmax=dp[j];
                if(j>0)
                    prevmax=Math.min(dp[j],dp[j-1]);
                dp1[j]=prevmax+triangle.get(i).get(j);
            }
            for (int j = 0; j < dp1.length; j++) {
                dp[j]=dp1[j];
            }
        }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < dp.length; i++) {
            if(min>dp[i])
                min=dp[i];
        }
        return min;
    }
}
