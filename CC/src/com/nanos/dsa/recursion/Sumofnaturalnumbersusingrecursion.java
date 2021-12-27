package com.nanos.dsa.recursion;

public class Sumofnaturalnumbersusingrecursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(recurSum(n));
    }

    private static int recurSum(int n) {
        if(n==0)
            return 0;
        return n+recurSum(n-1);
    }
}
