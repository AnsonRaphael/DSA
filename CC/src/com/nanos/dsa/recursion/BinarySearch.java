package com.nanos.dsa.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target=9;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);
    }
    public static int binarySearch(int[] nums,int s,int e, int target) {
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(nums[m]==target)
            return m;
        if(nums[m]<target){
           return binarySearch(nums,m+1,e,target);
        }else {
           return binarySearch(nums,s,m-1,target);
        }
    }
}
