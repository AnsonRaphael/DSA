package com.AlgorithmI;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int non=0,i=0;
        for(;i<nums.length;i++){
            if(nums[i]!=0){
                nums[non]=nums[i];
                non++;
            }
        }
        for(;non<nums.length;non++){
            nums[non]=0;
        }

    }
}
