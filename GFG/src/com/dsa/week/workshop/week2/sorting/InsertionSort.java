package com.dsa.week.workshop.week2.sorting;

import java.util.Arrays;

/*The array is split into two parts (sorted and unsorted ).
 Element (key) from unsorted part is compared with its predecessor and is it is
 smaller then we shift one place to right and compare again with next predecessor
  value till we obtain its correct position*/
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] ={4, 3, 2, 10, 12, 1, 5, 6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int [] arr){

        int j=0;
        for (int i=1;i<arr.length;i++){
            j=i-1;
            int key=arr[i];
            while (j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
