package com.nanos.dsa.introduction.conditionals_loops;

public class SumOfADigitsOfNumber {
    public static void main(String[] args) {
        int a=123,sum=0;
        while (a!=0){
            int c=a%10;
            sum+=c;
            a=a/10;
        }
        System.out.println(sum);
    }
}
