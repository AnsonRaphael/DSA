package com.nanos.dsa.introduction.conditionals_loops;

public class BattingAverage {
    public static void main(String[] args) {
        int runs = 10000;
        int matches = 250;
        int notout = 50;

        if(matches==notout)
            System.out.println("NA");
        else {
            System.out.println(Double.valueOf(runs)/((matches-notout)));
        }
    }
}
