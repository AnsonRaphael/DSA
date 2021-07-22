package com.dsa.week.workshop.week1.mathematics.problems;

public class AbsoluteValue {
    public static void main(String[] args) {
        int a=-10;
        System.out.println(absolute(a));
    }
    public static int absolute(int I) {
        // code here
        if(I<0)
            return -1*I;
        else
            return I;
    }
}
