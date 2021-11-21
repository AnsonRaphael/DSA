package com.nanos.dsa.sorting;

import java.util.Arrays;

public class SquaresSortedArray {
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums) {
        int s=0,e=nums.length-1,l=e;
        int [] res=new int[e+1];
        while(s<=e){
            if((nums[s]*nums[s])>(nums[e]*nums[e])){
                res[l]=nums[s];
                s++;
            }else{
                res[l]=nums[e];
                e--;
            }
            res[l]=(res[l]*res[l]);
            l--;

        }
        return res;
    }
}
