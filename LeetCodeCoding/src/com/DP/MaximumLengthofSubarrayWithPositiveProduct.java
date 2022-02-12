package com.DP;

public class MaximumLengthofSubarrayWithPositiveProduct {
    public static void main(String[] args) {

    }
    public static int getMaxLen(int[] nums) {
        int countNeg=0,zerloc=-1,max=0,firstNeg=-1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<0){
                countNeg++;
                if(firstNeg==-1)
                    firstNeg=i;
            }
            if(nums[i]==0){
                countNeg=0 ;
                zerloc=i;
                firstNeg=-1;
            }else{
                if(countNeg%2==0){
                    max=Math.max(max,i-zerloc);
                }else {
                    max=Math.max(max,i-firstNeg);
                }
            }
        }
        return max;
    }
}
