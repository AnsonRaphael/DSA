package com.nanos.dsa.arrays;

import java.util.Arrays;

public class CreateTargetArrayGivenOrder {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] res= new int [nums.length];
        for(int i=0;i<nums.length;i++){
            insertArray(res, nums[i],index[i]);
        }
        return res;
    }
    public static void insertArray(int [] arr,int val,int pos){
        for(int i=arr.length-1;i>pos;i--){
            if(i!=0)
                arr[i]=arr[i-1];
        }
        arr[pos]=val;
    }
}
