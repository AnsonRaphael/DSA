package com.DP;

public class NthTribonacciNumber {
    public int tribonacci(int n) {
        if(n<=1)
            return n;
        if(n==2)
            return 1;

        int f=0,s=1,t=1,w=1;
        for(int i=2;i<n;i++){
            w=f+s+t;
            f=s;
            s=t;
            t=w;
        }

        return w;

    }
}
