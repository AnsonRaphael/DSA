package com.nanos.dsa.introduction.functions;

public class Prime {
    public static void main(String[] args) {
        int a=5;
        System.out.println(isPrime(a));
    }
    static boolean isPrime(int a){
        boolean res=true;
        for (int i=2;i*i<=a;i++){
            if(a%i==0){
                res=false;
                break;
            }

        }
        return res;
    }
}
