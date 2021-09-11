package com.dsa.week.workshop.week4;

import java.util.Arrays;

public class DecimalBinaryConversion {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(Arrays.toString(decToBinary(n)));
    }

    private static int [] decToBinary(int n) {
        int [] arr=new int[32];
        int i=arr.length-1;
        while (n!=0){
            if((n&1)==0){
                arr[i]=0;
            }else {
                arr[i]=1;
            }
            i--;
            n>>=1;
        }
        return arr;
    }
}
