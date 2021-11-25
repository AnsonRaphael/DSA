package com.nanos.dsa.sorting;

import java.util.Arrays;

public class MaximumProductTwoElementsArray {
    public static void main(String[] args) {
        int[] nums={3,4,5,2};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}
