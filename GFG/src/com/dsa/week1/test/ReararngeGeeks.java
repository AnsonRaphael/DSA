package com.dsa.week1.test;

import java.util.Arrays;

public class ReararngeGeeks {
    public static void main(String[] args) {
        int[] array={0,5,1,2,4,3};
        int[] array2=Arrays.copyOf(array,array.length);
        int n=6;
        rearrange(array,n);
        System.out.println(Arrays.toString(array));
        rearrange(array2,n);
        System.out.println(Arrays.toString(array2));
    }
   static void rearrange(int[] array, int n){
        // code here
       int [] mn= new int[array.length];
       for (int i = 0; i < array.length; i++) {
           mn[i]=array[array[i]];
       }
       for (int i = 0; i < array.length; i++) {
           array[i]=mn[i];
       }
    }
    static void rearrange2(int[] array, int n){
        // code here

        for (int i = 0; i < array.length; i++) {
            array[i]+=(array[array[i]]%n)*n;
        }
        for (int i = 0; i < array.length; i++) {
            array[i]=array[i]/n;
        }


    }
}
