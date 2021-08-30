package com.nanos.dsa.arrays.searching;

public class RotationCount {
    public static void main(String[] args) {
        int arr[] = {15, 18, 2, 3, 6, 12};
        System.out.println(rotatecount(arr));
    }
    public static int rotatecount(int [] nums){
        int start=0,end=nums.length-1,mid=0;
        while (start<=end){
            mid=start+(end-start)/2;
            if(mid>start&& nums[mid]>nums[mid+1]){
                return mid+1;
            }
            if (mid<end&&nums[mid]<nums[mid-1]){
                return mid;
            }
            if(nums[start]>nums[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return mid;
    }
}
