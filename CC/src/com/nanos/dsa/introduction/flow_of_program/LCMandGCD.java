package com.nanos.dsa.introduction.flow_of_program;

public class LCMandGCD {
    public static void main(String[] args) {

        int a=15,b=20;
        System.out.println(GCD(a,b));
        System.out.println(LCM(a,b));
    }
    static int GCD(int a,int b){
        if(a==0){
            return b;
        }
        return   GCD(b%a,a);
    }

    static int LCM(int a,int b){

        return (a*b)/GCD(a,b);
    }

}
