package com.nanos.dsa.recursion;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        bubbleSort(arr, arr.length);

        System.out.println("Sorted array : ");
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int length) {

        if(length<0)
            return;

        for (int i = 0; i < length-1; i++) {
            if(arr[i]>arr[i+1]){
                int t = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=t;
            }
        }
        bubbleSort(arr,length-1);
    }
}
