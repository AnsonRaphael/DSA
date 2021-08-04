package com.dsa.week.workshop.week2.problem;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {4, 1 ,3 ,9, 7};
        mergeSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void merge(int arr[], int l, int m, int r)
    {
        // Your code here
        int sizeL=m-l+1;
        int sizeR=r-m;
        int ll[]=new int[sizeL];
        int rr[] = new int[sizeR];
        for (int i=0;i<sizeL;i++){
            ll[i]=arr[l+i];
        }
        for (int i=0;i<sizeR;i++){
            rr[i]=arr[m+i+1];
        }
        int i=0,j=0,k=l;
        for (;i<sizeL&&j<sizeR;k++){

            if(ll[i]<rr[j]){
                arr[k]=ll[i];
                i++;
            }else {
                arr[k]=rr[j];
                j++;
            }
        }

        while (i<sizeL){
            arr[k]=ll[i];
            i++;
            k++;
        }
        while (j<sizeR){
            arr[k]=rr[j];
            j++;
            k++;
        }


    }
    static void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
}
