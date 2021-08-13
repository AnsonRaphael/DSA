package com.nanos.dsa.introduction.functions;

public class OddEven {
    public static void main(String[] args) {
        int a=4,b=5;
        System.out.println(isEven(a));
        System.out.println(isEven(b));
    }
    static boolean isEven(int a){
        return a%2==0;
    }
}
