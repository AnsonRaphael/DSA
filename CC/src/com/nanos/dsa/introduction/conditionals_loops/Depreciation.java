package com.nanos.dsa.introduction.conditionals_loops;

public class Depreciation {
    public static void main(String[] args) {
        double V1 = 200, R = 10, T = 2;
        double res=V1*Math.pow((1-R/100),T);
        System.out.println(res);
    }
}
