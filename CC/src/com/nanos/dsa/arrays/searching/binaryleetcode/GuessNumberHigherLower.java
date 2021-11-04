package com.nanos.dsa.arrays.searching.binaryleetcode;

public class GuessNumberHigherLower {
    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
    public static int guessNumber(int n) {
        int l=1,r=n,m=1;
        while(l<=r){
            m=l+(r-l)/2;
            int v=guess(m);
            if(v==0){
                return m;
            }
            if(v==1){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return 0;
    }
    public static int guess(int k){
        int l=6;
        if(k==l)
            return 0;
        if(k<l)
            return -1;
        else
            return 1;

    }
}
