package com.nanos.dsa.introduction.conditionals_loops;

public class FindNCRAndNPR {
    public static void main(String[] args) {
        int n = 5, r = 2;
        System.out.println(nCr(n, r));
        System.out.println(nPr(n, r));
    }

    private static double nCr(int n, int r) {
        return fact(n)/(fact(r)*fact(n-r));
    }
    private static double nPr(int n, int r) {
        return fact(n)/(fact(n-r));
    }
    static double fact(int n){
        double fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
