package com.dsa.week.workshop.week3.matrix;

public class CheckTheNumberPowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(31) ? "Yes" : "No");
        System.out.println(isPowerOfTwo(64) ? "Yes" : "No");
    }
    static boolean isPowerOfTwo (int x){

        return (x!=0)&&((x&(x-1))==0);
    }
}
