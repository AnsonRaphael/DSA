package com.cc.arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums={-1};
        int k=2;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        k=nums.length-k;
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        reverse(nums,0,nums.length-1);

    }
    public static void reverse(int[] nums,int s,int e){
        while(s<=e){
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            s++;
            e--;
        }
    }
}
