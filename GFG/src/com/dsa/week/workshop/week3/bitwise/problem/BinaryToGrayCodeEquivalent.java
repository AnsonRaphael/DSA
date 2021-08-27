package com.dsa.week.workshop.week3.bitwise.problem;

public class BinaryToGrayCodeEquivalent {
    public static void main(String[] args) {
        int n=7;
        System.out.println(greyConverter(n));
    }
    public static int greyConverter(int n) {

        // Your code here
        return n^(n>>1);
    }
}
