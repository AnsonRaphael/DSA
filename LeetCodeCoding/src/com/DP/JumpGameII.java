package com.DP;

public class JumpGameII {
    public static void main(String[] args) {

    }
    public static int jump(int[] nums) {
        int i=0,reach=0,level=0;
        while (reach<nums.length-1){
            level++;
            int preState=reach;
            for(;i<=preState;i++)
                reach=Math.max(reach,i+nums[i]);
        }
        return level;
    }
}
