package com.nanos.dsa.recursion;

public class SpecialFibonacci {
    public static void main(String[] args) {
        int a=86 ;
        int b=77 ;
        int n=15;
        System.out.println(spfin(a,b,n));
    }
    public static int spfin(int a,int b,int n){
        if(n==0)
            return a;
        if(n==1)
            return b;
        return spfin(a,b,n-1)^spfin(a,b,n-2);
    }
}
