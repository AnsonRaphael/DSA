package com.AlgorithmI;

public class ReverseBits {
    public static void main(String[] args) {
       int n=42949672;
       System.out.println(reverseBits(n));
    }
    public static int reverseBits(int n) {
        int b=0;
        for (int i = 0; i < 32; i++) {
            b=b<<1;
            b=b|n&1;
            n=n>>1;
        }
        return b;
    }
}
