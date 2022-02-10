package com.DP;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums={-2,0,-1};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int res=nums[0];
        int curmin=1,curmax=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                curmin=1;curmax=1;
                res=Math.max(res,0);
                continue;
            }
            int tmp=curmax;
            curmax=Math.max(curmax*nums[i],Math.max(curmin*nums[i],nums[i]));
            curmin=Math.min(tmp*nums[i],Math.min(curmin*nums[i],nums[i]));
            res=Math.max(res,curmax);
        }
        return res;
    }

//    private static int maxPro(int[] nums, int i) {
//        if(i>=nums.length)
//            return 1;
//        int nxt=maxPro(nums,i+1);
//        return Math.max(nxt,nums[i]*nxt);
//
//    }
}
