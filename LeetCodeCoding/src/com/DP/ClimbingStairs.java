package com.DP;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n=3;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        int[] fn= new int[46];
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        fn[0]=0;
        fn[1]=1;
        fn[2]=2;
        for (int i = 3; i <= n; i++) {
            fn[i]=fn[i-1]+fn[i-2];
        }

        return fn[n];
    }
}
