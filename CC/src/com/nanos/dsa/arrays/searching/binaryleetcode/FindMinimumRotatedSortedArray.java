package com.nanos.dsa.arrays.searching.binaryleetcode;

public class FindMinimumRotatedSortedArray {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,8,9,0,1,2};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int l=0,r=nums.length-1,m=0;
        while (l<=r){
            m=l+(r-l)/2;
            if(m<r&&(nums[m]>nums[m+1])){
                return nums[m+1];
            }
            if(m>l&&(nums[m-1]>nums[m])){
                return nums[m];
            }
            if(nums[l]>=nums[m]){
                r=m-1;
            }else {
                l=m+1;
            }
        }
        return nums[0];
    }
}
