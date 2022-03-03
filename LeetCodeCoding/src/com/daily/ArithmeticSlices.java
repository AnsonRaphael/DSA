package com.daily;

public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        int slic=0,p=0;
        for (int i = 2; i <nums.length ; i++) {
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                p++;
                slic+=p;
            }else {
                p=0;
            }
        }
        return slic;
    }
}
