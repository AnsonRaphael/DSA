package com.dsa.week.workshop.week1.mathematics.problems;

public class AdditionUnderModulo {
    public static void main(String[] args) {
        long  a = 9223372036854775807l;
        long b = 9223372036854775807l;
        System.out.println(sumUnderModulo(a,b));
    }
    public static long sumUnderModulo(long a, long b){
        // code here
        long m = (long) (7 + Math.pow(10, 9));
        return ((a%m)+(b%m))%m;
    }
}
