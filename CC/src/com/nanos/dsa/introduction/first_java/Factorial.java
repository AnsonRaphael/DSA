package com.nanos.dsa.introduction.first_java;

public class Factorial {
    public static void main(String[] args) {
        int a=4;
        System.out.println(factorial(a));
    }
    static long factorial(long a){
        if(a==1)
            return a;
        return a*factorial(a-1);
    }
}
