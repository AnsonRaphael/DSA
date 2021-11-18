package com.nanos.dsa.sorting;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums={3,2,1};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max=nums[0],count=1;
        for(int i=nums.length-1;i>0;i--){
            max=nums[i];
            if(nums[i]!=nums[i-1]){
                count++;
                if(count==3){
                    max=nums[i-1];
                    return max;
                }

            }

        }
        return nums[nums.length-1];
    }
}
