package com.nanos.dsa.introduction.first_java;

public class FindAllFactor {
    public static void main(String[] args) {
        int a=100;
        for (int i=1;i<=Math.sqrt(a);i++){
            if(a%i==0){
                if(i==(a/i))
                    System.out.print(i+" ");
                else
                System.out.print(i+" "+(a/i)+" ");
            }
        }
    }
}
