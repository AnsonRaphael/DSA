package com.dsa.week.workshop.week3.bitwise;

public class XORAll1ToN {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(xorUptoN(n));
    }
    static int xorUptoN (int n){
        int rem=n%4;
        if(rem==3)
            return 0;
        if(rem==1)
            return 1;
        if(rem==2)
            return n+1;
        return n;
    }

}
