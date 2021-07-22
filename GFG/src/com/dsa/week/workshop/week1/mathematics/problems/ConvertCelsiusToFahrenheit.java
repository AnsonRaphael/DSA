package com.dsa.week.workshop.week1.mathematics.problems;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
    int C = 32;
    System.out.println(cToF((C)));
    }
    public static double cToF(int C)
    {
        //Your code here
        return (C*9/5)+32;
    }
}
