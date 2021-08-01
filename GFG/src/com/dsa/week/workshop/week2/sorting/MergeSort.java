package com.dsa.week.workshop.week2.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] ={4, 3, 2, 10, 12, 1, 5, 6};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low<high){
            int mid=(low+high)/2;

            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }

    }
    private static void merge(int[] arr, int low,int m, int high){

        int sizL=m-low+1;
        int sizR=high-m;
        int ra[]= new int[sizR];
        int la[] = new int[sizL];
        for (int i=0;i<sizL;i++)
            la[i]=arr[low+i];
        for (int j=0;j<sizR;j++)
            ra[j]=arr[m+j+1];
        int i=0, j=0, k=0;
        for (i=0, j=0, k=low;(i<sizL && j<sizR);k++){
            if(la[i]<ra[j]){
                arr[k]=la[i];
                i++;
            }else {
                arr[k]=ra[j];
                j++;
            }
        }
        if(i<sizL){
            for (;i<sizL;i++,k++){
                arr[k]=la[i];
            }
        }
        if(j<sizR){
            for (;j<sizR;j++,k++){
                arr[k]=ra[j];
            }
        }
    }
}
