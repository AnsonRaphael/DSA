package com.nanos.dsa.sorting;

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanEqualX {
    public static void main(String[] args) {
        int[] nums={3,9,7,8,3,8,6,6};
        System.out.println(specialArray(nums));
    }
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<=nums.length;i++){
           int m=ceilSearch(nums,0,nums.length-1,i);
           int l=nums.length-m;
           if(l==i){
               return i;
           }
        }
        return -1;
    }
    static int ceilSearch(int arr[], int low, int high, int x){
        int mid=0,res=-1;
        while (low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==x&&(mid==0||arr[mid-1]!=x)){
                return mid;
            }
            if(arr[mid]>=x){
                res=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return res;
    }

}
