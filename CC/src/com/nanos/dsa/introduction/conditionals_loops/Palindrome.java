package com.nanos.dsa.introduction.conditionals_loops;

public class Palindrome {
    public static void main(String[] args) {
        int a=121;
        int d=a,n=0;
        while (d!=0){
            int c=d%10;
            d=d/10;
            n=n*10+c;
        }
        System.out.println((n==a));
    }
}
