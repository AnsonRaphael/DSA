package com.dsa.week.workshop.week3.bitwise.problem;

public class Power2 {
    public static void main(String[] args) {
        long n=1;
        System.out.println(isPowerofTwo(n));
    }
    public static boolean isPowerofTwo(long n){

        // Your code here
        if(n<1){
            return false;
        }
        return !((n&(n-1))!=0);

    }
}
