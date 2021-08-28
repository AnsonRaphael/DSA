package com.dsa.week.workshop.week3.bitwise.problem;

public class SwapAllOddAndEvenBits {
    public static void main(String[] args) {
        int n=23;
        System.out.println(swapBits(n));
    }
    public static int swapBits(int n)
    {
        // Your code
        int even = n & 0xAAAAAAAA;
        int odd = n& 0x55555555;
        even>>=1;
        odd<<=1;
        return (even|odd);

    }

}
