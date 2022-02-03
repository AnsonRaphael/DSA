package com.DP;

public class FibonacciNumber {
    public static void main(String[] args) {
        int a=50;
        System.out.println(fib(a));
    }

    public static int fib(int n) {
        if(n<=1)
            return n;
        int f=1,s=1,t=1;
        for(int i=2;i<n;i++){
            t=f+s;
            f=s;
            s=t;
        }
        return t;
    }
}
