package com.nanos.dsa.introduction.functions;

public class factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(5));
    }


    static double fact(int n){
        double fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
