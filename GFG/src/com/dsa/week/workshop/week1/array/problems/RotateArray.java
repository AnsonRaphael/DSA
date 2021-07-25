package com.dsa.week.workshop.week1.array.problems;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int N = 5, D = 2;
        rotateArr(arr,D,N);
        display(arr);
    }
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

    }
    static void reverse(int[] arr,int sm,int end){

        while(end>sm){
            int t= arr[end];
            arr[end]=arr[sm];
            arr[sm]=t;
            sm++;
            end--;
        }
    }
    private static void display(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("");

    }
}
