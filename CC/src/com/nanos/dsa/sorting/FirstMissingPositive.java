package com.nanos.dsa.sorting;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums={2,1};
    // int[] nums={0,1,2};
        //int[] nums={1};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(correctIndex<nums.length-1&&correctIndex>=0){
                if(nums[correctIndex]!=nums[i]){
                    swap(nums,i,correctIndex);
                }else {
                    i++;
                }
            }else{
                i++;
            }
        }
        int res=1;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]==res){
                res++;
            }
        }
        return res;
    }

    private static void swap(int[] nums, int i, int correctIndex) {
        int t=nums[i];
        nums[i]=nums[correctIndex];
        nums[correctIndex]=t;
    }
}
