package com.dsa.week.workshop.week3.matrix;

public class FindOptimalWeightsWhichCanBeUsedToWeighAllTheWeightsInTheRange {
    public static void main(String[] args) {
        int X = 2;

        findWeights(X);
    }

    private static void findWeights(int x) {
        int sum=0;
        int number=3;
        int power=0;
        while (sum<x){
            sum=number-1;
            sum/=2;
            power++;
            number*=3;
        }
        int ans=1;
        for (int i=0;i<power;i++){
            System.out.print(ans+" ");
            ans*=3;
        }
    }

}
