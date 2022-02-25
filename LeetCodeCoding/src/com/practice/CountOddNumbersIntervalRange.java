package com.practice;

public class CountOddNumbersIntervalRange {
    public int countOdds(int low, int high) {
        int oddLow=oddReturn(low);
        int oddhigh=oddReturn(high);
        int lm=low%2==0?0:1;
        return (oddhigh-oddLow)+lm;
    }

    public static int oddReturn(int n){
        if(n%2==0){
            return n/2;
        }else{
            return ((n-1)/2)+1;
        }
    }
}
