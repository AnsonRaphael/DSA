package com.nanos.dsa.recursion;

public class PowerofThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(7));
    }
    public static boolean isPowerOfThree(int n) {
        if(n==0||n==2)
            return false;
        if(n==1)
            return true;
        return n%3==0&&isPowerOfThree(n/3);
    }
}
