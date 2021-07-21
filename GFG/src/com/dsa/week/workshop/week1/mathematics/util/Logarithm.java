package com.dsa.week.workshop.week1.mathematics.util;

public class Logarithm {
    public static void main(String[] args) {
        int a=100;
        int b=10;
        System.out.println(logarithmtoBase(a,b));
        System.out.println(logarithmtoBase1(a,b));
    }
    // recursive time-O(log(n))
    private static double logarithmtoBase(int a,int b){
        return (a>1)?(1+logarithmtoBase(a/b,b)):0;
    }
    // using in built log function O(1)
    private static double logarithmtoBase1(int a,int b){
        return Math.log10(a)/Math.log10(b); // change of base rule
    }
}
