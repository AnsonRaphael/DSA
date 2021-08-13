package com.nanos.dsa.introduction.functions;

public class MInAndMax {
    public static void main(String[] args) {
        int a=2,b=5,c=3;
        System.out.println(min(a,b,c));
        System.out.println(max(a,b,c));
    }
    static int min(int a,int b,int c){
        int min=a;
        if(min>b){
            min=b;
        }
        if(min >c){
            min =c;
        }
        return min;
    }
    static int max(int a,int b,int c){
        int max=a;
        if(max<b){
            max=b;
        }
        if(max <c){
            max =c;
        }
        return max;
    }
}
