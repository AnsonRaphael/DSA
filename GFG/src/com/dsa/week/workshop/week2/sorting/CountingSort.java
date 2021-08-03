package com.dsa.week.workshop.week2.sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int arr[] ={2,1,-2,-4,5,0};//{4, 3, 2, 10, 12, 1, 5, 6};
        countingSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void countingSort(int[] arr, int n) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        int range = max-min+1;
        int count[] = new int[range];
        int result[] = new int[n];
        for (int i=0;i<n;i++)
            count[arr[i]-min]++;
        for (int i=1;i<range;i++)
            count[i]+=count[i-1];
        System.out.println(Arrays.toString(count));
        for (int i=n-1;i>=0;i--){

            result[count[arr[i]-min]-1]=arr[i];
            System.out.println(Arrays.toString(result));
            --count[arr[i]-min];
        }

        for (int i=0;i<n;i++){
            arr[i]=result[i];
        }

    }

}
