package com.nanos.dsa.introduction.functions;

public class Pythogorian {
    public static void main(String[] args) {
        int a=3,b=4,c=5;
        System.out.println(isPyth(a,b,c));
    }
    static boolean isPyth(int a,int b,int c){
        return (c*c)==((a*a)+(b*b));
    }
}
