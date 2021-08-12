package com.nanos.dsa.introduction.conditionals_loops;

public class Power {
    public static void main(String[] args) {
        int a=2,b=3,pow=1;
        for (int i=1;i<=b;i++){
            pow*=a;
        }
        System.out.println(pow);
    }
}
