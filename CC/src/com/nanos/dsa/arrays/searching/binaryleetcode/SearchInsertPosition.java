package com.nanos.dsa.arrays.searching.binaryleetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=2;
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int res=0,l=0,r=nums.length-1,m=0;
        while(l<=r){
            m=l+(r-l)/2;
            if(nums[m]==target){
                return m;
            }
            if(nums[m]<target){
                res=m;
                l=m+1;
            }else{
                r=m-1;
            }

        }
        if(nums[res]<target)
            res++;
        return res;
    }
}
