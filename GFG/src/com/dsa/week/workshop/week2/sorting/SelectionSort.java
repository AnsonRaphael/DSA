package com.dsa.week.workshop.week2.sorting;

import java.util.Arrays;
/*Repeatedly finding minimum element from unsorted part of the array and placing it in the first.*/
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] ={4, 3, 2, 10, 12, 1, 5, 6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int [] arr){
        int minIdx=0,j=0;
        for (int i=0;i<arr.length;i++){
            minIdx=i;
            j=i+1;
            int key=arr[minIdx];
            while (j<arr.length){
                if(arr[minIdx]>arr[j]){
                    minIdx=j;
                }
                j++;
            }
            arr[i]=arr[minIdx];
            arr[minIdx]=key;

        }

    }
}
