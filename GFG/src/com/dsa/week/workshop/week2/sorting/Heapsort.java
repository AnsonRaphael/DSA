package com.dsa.week.workshop.week2.sorting;

import java.util.Arrays;

public class Heapsort {
    public static void main(String[] args) {
        int [] arr=  {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        int n=arr.length;
        System.out.println(Arrays.toString(arr));
        int nonlfnode=(n/2)-1;
        for (int i=nonlfnode;i>=0;i--) {
            heapify(arr, n, i);
        }
        heapSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapify(int[] arr,int n,int i){
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;

        // check left child
        if(l<n&&arr[l]>arr[largest])
            largest=l;
        if(r<n&&arr[r]>arr[largest])
            largest=r;

        if(largest!=i){
            swap(arr,largest,i);
            heapify(arr,n,largest);
        }
    }

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void heapSort(int[] arr,int n){

       for (int i=n-1;i>=0;i--){
           swap(arr,0,i);
           int nonlfnode=(i/2)-1;
           heapify(arr,i,0);
       }
    }

}
