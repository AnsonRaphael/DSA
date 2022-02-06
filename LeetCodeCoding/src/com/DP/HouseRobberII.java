package com.DP;

public class HouseRobberII {
    public int robs(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
            return Math.max(nums[0],nums[1]);
        return Math.max(rob(nums,0,nums.length-1),rob(nums,1,nums.length));
    }

    public static int rob(int[] nums,int s,int e) {
        int[] maxMoney=new int[e-s];
        if(e-s==0)
            return 0;
        if(e-s==1)
            return nums[s];
        if(e-s==2)
            return Math.max(nums[s],nums[s+1]);

        maxMoney[0]=nums[s];
        maxMoney[1]=Math.max(nums[s],nums[s+1]);
        for(int i=2;i<e-s;i++){
            maxMoney[i]=Math.max(nums[s+i]+maxMoney[i-2],maxMoney[i-1]);
        }
        return maxMoney[nums.length-1];
    }
}
