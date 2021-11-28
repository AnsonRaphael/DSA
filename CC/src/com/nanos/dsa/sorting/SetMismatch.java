package com.nanos.dsa.sorting;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums={1,5,3,2,2,7,6,4,8,9};
        //System.out.println(Arrays.toString(findErrorNums(nums)));
        System.out.println(Arrays.toString(findErrorNums2(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int rep=nums[0],mis=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                rep=nums[i];
            }
            if(mis==nums[i]){
                mis++;
            }
        }
        if(mis==nums[nums.length-1]){
            mis++;
        }
        int []res={rep,mis};
        return res;

    }
    public static int[] findErrorNums2(int[] nums) {

        int rep=nums[0],mis=1;
        int i=0;
        int []res=new int[2];
        while(i<nums.length){

            int correctIndex=nums[i]-1;

            if(nums[correctIndex]!=nums[i]){
                swap(nums,correctIndex,i);
            }else {
                i++;
            }



        }
        for( i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                res[0]=nums[i];
                res[1]=i+1;
            }
        }

        return res;

    }

    private static void swap(int[] nums, int n, int i) {
        int t=nums[n];
        nums[n]=nums[i];
        nums[i]=t;

    }
}
