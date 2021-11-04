package com.nanos.dsa.arrays.searching.binaryleetcode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target=9;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int l=0,r=nums.length-1,m=0;
        while(l<=r){
            m=l+(r-l)/2;
            if(nums[m]==target){
                return m;
            }
            if(nums[m]<target){
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return -1;
    }
}
