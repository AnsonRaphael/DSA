package com.nanos.dsa.introduction.conditionals_loops;

public class Distance {
    public static void main(String[] args) {
        System.out.println(distance(3, 4, 4, 3));
    }

    private static double distance(int i, int i1, int i2, int i3) {

        return Math.sqrt(Math.pow(i2-i,2)+Math.pow(i3-i1,2));
    }
}
