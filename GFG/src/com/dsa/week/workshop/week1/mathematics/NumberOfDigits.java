package com.dsa.week.workshop.week1.mathematics;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n=2019;
        System.out.println(numberOfDigit2(n));
    }
    private static int numberOfDigit1(int a){
        int result=0;
        if(a==0)
            result=1;
        while(a>0){
            a=a/10;
            result++;
        }
        return result;
    }
    // time and space - O(1)
    private static int numberOfDigit2(int a){
        int result=0;
        result= (int) (Math.log10(a)+1);
        return result;
    }

}
