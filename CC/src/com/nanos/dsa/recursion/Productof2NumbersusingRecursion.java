package com.nanos.dsa.recursion;

public class Productof2NumbersusingRecursion {
    public static void main(String[] args) {
        int x = 5, y = 2;
        System.out.println(product(x, y));
    }

    private static int product(int x, int y) {
        if (x < y)
            return product(y, x);
        else if (y != 0)
            return (x + product(x, y - 1));
        else
            return 0;
    }
}
