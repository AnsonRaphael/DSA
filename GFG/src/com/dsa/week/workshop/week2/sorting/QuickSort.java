package com.dsa.week.workshop.week2.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        //int arr[] ={4, 3, 2, 10, 12, 1, 5, 6};
        int arr[] = {4, 1 ,3 ,9, 7};
        quickSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr ,int high,int low) {
        if (low < high) {
            int pov = partition(arr, high, low);
            quickSort(arr, pov-1, low);
            quickSort(arr, high, pov + 1);
        }
    }
    private static int partition(int[] arr, int high,int low){

        int pivotElement=arr[high];
        int j=low;
        for (int i=low;i<high;i++){
            if(arr[i]<=pivotElement){
                swap(arr,i,j);
                j++;
            }
        }

       swap(arr,j,high);
        return j;
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
