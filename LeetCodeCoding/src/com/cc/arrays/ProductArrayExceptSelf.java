package com.cc.arrays;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }
    public static int[] productExceptSelf(int[] nums) {
        int noofzero=0,product=1;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                noofzero++;
            else
                product*=nums[i];
        }
        if(noofzero>1)
            return res;
        if(noofzero==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    res[i]=product;
                }
            }
            return res;
        }
        for(int i=0;i<nums.length;i++){

            res[i]=product/nums[i];

        }
        return res;
    }
}
