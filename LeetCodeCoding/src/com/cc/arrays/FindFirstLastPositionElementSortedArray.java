package com.cc.arrays;

import java.util.Arrays;

public class FindFirstLastPositionElementSortedArray {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int f= first(nums, target);
        int l= last(nums, target);
        int[] res=new int[2];
        res[0]=f;
        res[1]=l;
        return res;
    }
    public static int first(int[] nums,int k){
        int l=nums.length-1,f=0;
        while(f<=l){
            int mid=(l+f)/2;
            if(nums[mid]==k&&(mid==0||nums[mid-1]!=k)){
                return mid;
            }
            if(nums[mid]>=k){
                l=mid-1;
            }else{
                f=mid+1;
            }
        }
        return -1;
    }
    public static int last(int[] nums,int k){
        int l=nums.length-1,f=0;
        while(f<=l){
            int mid=(l+f)/2;
            if(nums[mid]==k&&(mid==nums.length-1||nums[mid+1]!=k)){
                return mid;
            }
            if(nums[mid]<=k){
                f=mid+1;
            }else{
                l=mid-1;
            }
        }
        return -1;
    }
}
