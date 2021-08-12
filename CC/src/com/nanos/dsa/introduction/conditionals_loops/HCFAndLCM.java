package com.nanos.dsa.introduction.conditionals_loops;

public class HCFAndLCM {
    public static void main(String[] args) {
        int a=15,b=20;
        System.out.println(GCD(a,b));
        System.out.println(LCM(a,b));
    }

    private static int LCM(int a, int b) {
        return (a*b)/GCD(a,b);
    }

    private static int GCD(int a, int b) {
        if(a==0)
            return b;
        return  GCD(b%a,a);
    }
}
