package com.cc.arrays;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int [] nums = {2,5,1,3,4,7};int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] res= new int [2*n];
        for(int i=0,j=0;i<n;i++,j++){
            res[j]=nums[i];
            j++;
            res[j]=nums[i+n];
        }
        return res;
    }
}
