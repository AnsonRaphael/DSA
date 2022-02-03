package com.AlgorithmI;

public class RotateArray {
    public void rotate(int[] nums, int k) {

        k=k%nums.length;
        reverse(nums,0,nums.length-1-k);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);

    }
    public void reverse(int[] nums,int s,int e){
        while(s<=e){
            int m= nums[s];
            nums[s]=nums[e];
            nums[e]=m;
            s++;
            e--;
        }
    }
}
