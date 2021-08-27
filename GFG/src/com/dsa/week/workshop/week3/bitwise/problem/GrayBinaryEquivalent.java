package com.dsa.week.workshop.week3.bitwise.problem;

public class GrayBinaryEquivalent {
    public static void main(String[] args) {
        int n=4;
        System.out.println(grayToBinary(n));
    }
    public static int grayToBinary(int n) {

        // Your code here
        int res = n;

        while (n > 0) {
            n >>= 1;
            res ^= n;
        }

        return res;
    }
}
