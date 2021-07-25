package com.dsa.week.workshop.week1.array.problems;

public class WaveArray {
    public static void main(String[] args) {
        int arr[] = {2,4};
        int n = 2;
        convertToWave(arr,n);
        display(arr);
    }
    public static void convertToWave(int arr[], int n){
        // Your code here
        for(int i=1;i<n;i+=2){
            int t=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=t;
        }
    }
    private static void display(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("");

    }
}
