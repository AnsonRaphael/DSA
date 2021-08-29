package com.nanos.dsa.arrays.searching;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr={0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int low=0,high=arr.length-1,mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if((mid==0||arr[mid-1]<arr[mid])&&(mid==arr.length-1||arr[mid+1]<arr[mid])){
                return mid;
            }
            if(mid==arr.length-1||arr[mid+1]>arr[mid]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return -1;
    }

    public static int findPeakElement(int[] arr) {
        int low=0,high=arr.length-1,mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if((mid==0||arr[mid-1]<arr[mid])&&(mid==arr.length-1||arr[mid+1]<arr[mid])){
                return mid;
            }
            if(mid==arr.length-1||arr[mid+1]>arr[mid]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return -1;
    }
}
