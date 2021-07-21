package com.dsa.week.workshop.week1;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int d=3;
        int result = binarySearchArray(arr,d);
        if(result==-1)
            System.out.println("Not found ");
        else
            System.out.println("Found at index:- "+result);
    }
    public static int binarySearchArray(int[] arr,int d){
        int result=-1;
        int left=0,right=arr.length-1,mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(arr[mid]==d){
                result=mid;
                break;
            }
            if(arr[mid]<d){
                left=mid+1;
            }
            if(arr[mid]>d){
                right=mid-1;
            }
        }
        return result;
    }
}
