package com.DP;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums={3,2,1,0,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int reach=0,i=0;
        for(;i<nums.length&&i<=reach;i++){

            reach=Math.max(reach,i+nums[i]);
        }
        return i==nums.length;
    }
}
