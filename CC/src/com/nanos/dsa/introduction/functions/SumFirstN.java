package com.nanos.dsa.introduction.functions;

public class SumFirstN {
    public static void main(String[] args) {
        int n=4;
        System.out.println(sumN(n));
    }
    static int sumN(int n){
        return (n*(n+1)/2);
    }
}
