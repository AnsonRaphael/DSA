package com.dsa.week.workshop.week3.bitwise;

public class PowerOf2 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isPower2(n));
    }
    static  boolean isPower2(int a){
        if(a<1)
            return false;
        int b=a-1;
        return (a&b)==0;
    }
}
