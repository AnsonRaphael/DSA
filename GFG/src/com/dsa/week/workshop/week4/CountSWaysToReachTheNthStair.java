package com.dsa.week.workshop.week4;

public class CountSWaysToReachTheNthStair {
    public static void main(String[] args) {
        int s = 4, m = 2;
        System.out.println("Number of ways = "
                + countWays(s+1, m));
    }

    private static int countWays(int s, int m) {
        int res=0;
        if(s<=1)
            return s;
        for (int i=1;i<=m;i++){
            res+=countWays(s-i,m);
        }
        return res;
    }
}
