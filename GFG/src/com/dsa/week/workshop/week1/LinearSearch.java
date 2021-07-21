package com.dsa.week.workshop.week1;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int d=3;
        int result = linearSearchArray(arr,d);
        if(result==-1)
            System.out.println("Not found ");
        else
            System.out.println("Found at index:- "+result);
    }
    public static int linearSearchArray(int[] arr,int d){
        int result=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                result=i;
                break;
            }

        }
        return result;
    }
}
