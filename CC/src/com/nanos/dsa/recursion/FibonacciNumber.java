package com.nanos.dsa.recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n=4;
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        if(n==0)
            return 0;
        if (n==1)
            return 1;
        return fib(n-2)+fib(n-1);
    }
}