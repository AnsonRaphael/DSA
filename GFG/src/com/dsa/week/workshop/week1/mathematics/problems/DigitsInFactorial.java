package com.dsa.week.workshop.week1.mathematics.problems;

public class DigitsInFactorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(digitsInFactorial(n));
    }
    public static int digitsInFactorial(int N){
        // code here
        double a=0;
        for(int i=1;i<=N;i++)
            a= (a+(Math.log10(i)));
        return (int) a+1;
        //return (int) (Math.log10(a)+1);
    }
}
