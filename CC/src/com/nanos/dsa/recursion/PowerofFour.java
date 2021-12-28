package com.nanos.dsa.recursion;

public class PowerofFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(8));
    }
    public static boolean isPowerOfFour(int n) {
        if(n==0||n==2||n==3)
            return false;
        if(n==1)
            return true;
        return n%4==0&&isPowerOfFour(n/4);
    }
}
