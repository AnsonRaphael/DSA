package com.nanos.dsa.introduction.conditionals_loops;

public class Fibonacci {
    public static void main(String[] args) {
        int a=5,n=1,f=0,s=1;

        for (int i=0;i<a;i++){
            System.out.println(n);
            n=f+s;
            f=s;
            s=n;


        }
    }
}
