            package com.nanos.dsa.arrays.searching.binaryleetcode;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,8,9,0,1,2};
        System.out.println(search(nums,2));
    }
    public static int search(int[] nums, int target) {
        int piv=  findPivot( nums);
        if(piv!=-1&&target==nums[piv])
            return piv;
        int res=binarySearch(nums,target,0,piv-1);
        if(res==-1){
            res=binarySearch(nums,target,piv+1,nums.length-1);
        }
        return res;
    }
    public static int findPivot(int[] nums){
        int l=0,r=nums.length-1,m=0;
        while (l<=r){
            m=l+(r-l)/2;
            if(m<r&&(nums[m]>nums[m+1])){
                return m;
            }
            if(m>l&&(nums[m-1]>nums[m])){
                return m-1;
            }
            if((nums[l]>=nums[m])){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] nums, int target,int start,int end) {

        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
