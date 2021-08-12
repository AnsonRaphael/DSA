package com.nanos.dsa.introduction.conditionals_loops;

public class FactorialProgram {
    public static void main(String[] args) {
        int n=4;
        System.out.println(factorial(n));
    }
    static int factorial(int a){
        if(a==1)
            return a;
        else
           return a*factorial((a-1));
    }
}
