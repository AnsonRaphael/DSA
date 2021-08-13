package com.nanos.dsa.introduction.functions;

import java.util.ArrayList;

public class PrimeRange {
    public static void main(String[] args) {
        int a=5,b=15;
        System.out.println(primeDisplay(a,b));
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
    static ArrayList<Integer> primeDisplay(int a, int b){
        ArrayList<Integer>ar=new ArrayList<>();
        for (int i=a;i<=b;i++){
            if(isPrime(i)){
                ar.add(i);
            }
        }
        return ar;
    }
}
