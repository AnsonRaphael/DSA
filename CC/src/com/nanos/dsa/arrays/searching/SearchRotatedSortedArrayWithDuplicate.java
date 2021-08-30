package com.nanos.dsa.arrays.searching;

public class SearchRotatedSortedArrayWithDuplicate {
    public static void main(String[] args) {
        int [] nums={2,9,2,2,2};
        int target=2;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int piv=  findPivot( nums);
//        if(piv==-1)
//            return -1;
        if(piv!=-1&&target==nums[piv])
            return piv;
        if(piv==-1){
         return binarySearch(nums,target,0,nums.length-1);
        }
        int res=binarySearch(nums,target,0,piv-1);
        if(res==-1){
            res=binarySearch(nums,target,piv+1,nums.length-1);
        }
        return res;
    }
    public static int findPivot(int[] nums){
        int start=0,end=nums.length-1,mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid<end&& nums[mid]>nums[mid+1])
                return mid;
            if(mid>start&& nums[mid]<nums[mid-1])
                return mid-1;

            if(nums[start]==nums[mid]&&nums[mid]==nums[end]){
                if(nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if(nums[end-1]>nums[end]){
                    return end -1;
                }
                end--;
            }else if(nums[start]<nums[mid]||(nums[start]==nums[mid]&&nums[mid]>nums[end])){
                start=mid+1;
            }else {
                end=mid-1;
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
