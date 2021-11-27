package com.nanos.dsa.sorting;

import java.util.Arrays;

public class KthLargestElementArray {
    public static void main(String[] args) {
        int[] nums={3,2,1,5,6,4};
        int k=4;
        System.out.println(findKthLargest(nums,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
