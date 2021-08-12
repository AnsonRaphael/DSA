package com.nanos.dsa.introduction.conditionals_loops;

public class FutureInvestment {
    public static void main(String[] args) {
        double principle = 1200, rate = 5.4, time = 2;
        System.out.println(principle*Math.pow((1+rate/100),time));
    }
}
