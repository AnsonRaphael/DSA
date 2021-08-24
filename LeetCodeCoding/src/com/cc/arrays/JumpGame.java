package com.cc.arrays;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums={2,0};
        System.out.println(canJump(nums));

    }
    public static boolean canJump(int[] nums) {
        int i=0,maxReach=0;
        while(i<nums.length && i<=maxReach){
            maxReach = Math.max(i + nums[i], maxReach);
            i++;
        }
        if(i==nums.length)
            return true;
        return false;
    }
}
