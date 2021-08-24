package com.cc.arrays;

import java.util.Arrays;

public class ConcatenationArray {
    public static void main(String[] args) {
        int []  nums = {1,2,3};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int [] res = new int[2*len];
        for(int i=0;i<2*len;i++){
            res[i]=nums[i%len];
        }
        return res;
    }
}
