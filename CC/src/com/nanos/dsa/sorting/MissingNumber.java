package com.nanos.dsa.sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i];
            if(correctIndex<nums.length&&nums[correctIndex]!=nums[i]){
                swap(nums,correctIndex,i);
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }
    public static void swap(int[] nums,int f,int s){
        int temp = nums[f];
        nums[f]=nums[s];
        nums[s]=temp;
    }
}
