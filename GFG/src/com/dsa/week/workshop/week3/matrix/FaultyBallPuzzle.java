package com.dsa.week.workshop.week3.matrix;

public class FaultyBallPuzzle {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fault(n));
    }
    static int fault(int a){
        int res=0;
        while (a>1){
            a=a/3;
            res++;
        }
        return res;
    }
}
