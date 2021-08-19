package com.nanos.dsa.arrays;

import java.util.Arrays;

public class RunningSumArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int [] runningsum=new int[nums.length];
        if(nums.length==0)
            return runningsum;
        runningsum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            runningsum[i]=nums[i]+runningsum[i-1];
        }
        return runningsum;
    }
}
