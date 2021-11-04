package com.nanos.dsa.arrays.searching.binaryleetcode;

import java.util.Arrays;

public class FrequencyheMostFrequentElement {
    public static void main(String[] args) {
        int[] nums={1,2,4};
        int k=5;
        System.out.println(maxFrequency(nums,k));
    }
    public static int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);
        long sum=nums[0];
        int r=1;
        int ans=0;
        int n=nums.length;
        for (int i=0;i<nums.length;i++){
            if(i!=0){
                sum-=nums[i-1];
            }
            while (r<n&&(nums[r]*(r-i+1)-(sum+nums[r])) <= k){
                sum+=nums[r];
                r++;
            }
            ans=Math.max(ans,r-i);
        }
        return ans;
    }
}
