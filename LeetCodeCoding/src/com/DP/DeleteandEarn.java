package com.DP;

public class DeleteandEarn {
    public int deleteAndEarn(int[] nums) {
        int[] frq=new int[10001];
        for(int i=0;i<nums.length;i++){
            ++frq[nums[i]];
        }
        frq[10000]= frq[10000]*10000;
        frq[9999]= Math.max(frq[9999]*9999,frq[10000]);

        for(int i=9998;i>=0;i--){
            frq[i]= Math.max(frq[i]*i+frq[i+2],frq[i+1]);
        }
        return frq[0];
    }
}
