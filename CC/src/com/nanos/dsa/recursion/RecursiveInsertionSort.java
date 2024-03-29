package com.nanos.dsa.recursion;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};

        insertionSortRecursive(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSortRecursive(int[] arr, int n) {
        if(n<=1)
            return;
        insertionSortRecursive(arr,n-1);
        int key=arr[n-1];
        int j=n-2;
        while (j>=0&&arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }

}
