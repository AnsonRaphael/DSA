package com.dsa.week.workshop.week3.matrix;

public class MinimumCutPuzzle {
    public static void main(String[] args) {
        int x=8;
        int pow=0,sum=0,num=2;
        while (sum<x){
            sum=num-1;
            pow++;
            num*=2;
        }
        int ans=1;
        for (int i=0;i<pow;i++){

            System.out.print(ans+" ");

            ans*=2;
        }
    }
}
