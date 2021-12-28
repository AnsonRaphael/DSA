package com.nanos.dsa.recursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println(factorials(5));
    }
    public static int factorials(int n) {
        // Write your code here
        if(n<=1)
            return 1;
        return n*factorials(n-1);
    }
}
