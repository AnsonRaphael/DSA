package com.dsa.week.workshop.week4;

import java.util.Arrays;

public class GenerateAllTheBinaryStringsOfNBits {
    public static void main(String[] args) {
        int n = 2;

        int[] arr = new int[n];

        // Print all binary strings
        generateAllBinaryStrings(n, arr, 0);
    }

    private static void generateAllBinaryStrings(int n, int[] arr, int i) {
        if(i==n){
                printArray(arr);
            return;
        }
        arr[i]=0;
        generateAllBinaryStrings(n,arr,i+1);
        arr[i]=1;
        generateAllBinaryStrings(n,arr,i+1);
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
