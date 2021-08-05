package com.dsa.week.workshop.week2.problem;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {4, 1 ,3 ,9, 7};
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
            int partIndex=partition(arr,low,high);
            quickSort(arr,low,partIndex-1);
            quickSort(arr,partIndex+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot=arr[high];
        int j=low;
        for (int i=low;i<high;i++){
            if(arr[i]<=pivot){
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
