package com.nanos.dsa.sorting;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int res=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int res1=nums[0]*nums[1]*nums[nums.length-1];
        if(res>res1){
            return res;
        }else{
            return res1;
        }

    }
}
