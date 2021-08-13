package com.nanos.dsa.introduction.functions;

public class Voting {
    public static void main(String[] args) {
        int a=17;
        System.out.println(isEligible(a));
    }
    static boolean isEligible(int a){
        return a>=18;
    }
}
