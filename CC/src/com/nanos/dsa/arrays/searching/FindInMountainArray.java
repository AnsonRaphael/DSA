package com.nanos.dsa.arrays.searching;

public class FindInMountainArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,3,1};
        int target=3;
        System.out.println(findElement(arr,target));
    }
    public static int findElement(int[] arr,int target){
        int peak=peakElement(arr);
        if(arr[peak]==target)
            return peak;
        int res=orderAgnosticBinarySearch(arr,0,peak,target);
        if(res!=-1){
            return res;
        }
        return orderAgnosticBinarySearch(arr,peak,arr.length-1,target);
    }
    public static int peakElement(int [] arr){
        int start=0,end=arr.length-1,mid=0;
        while (start<end){
            mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else {
                start=mid+1;
            }
        }
        return start;
    }
    public static int orderAgnosticBinarySearch(int [] arr,int start,int end,int target){
        boolean isAsc=true;
        if(arr[start]>arr[end])
            isAsc=false;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            if(isAsc){
                if(arr[mid]>target){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else {
                if(arr[mid]>target){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
