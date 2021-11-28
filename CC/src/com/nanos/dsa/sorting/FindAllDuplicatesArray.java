package com.nanos.dsa.sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesArray {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> val=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0){
                val.add( index+1);
            }
            nums[index]=nums[index]*-1;
        }
        return val;
    }
    public static List<Integer> findDuplicates2(int[] nums) {
        List<Integer> val=new ArrayList<>();

        int i=0;
        while(i<nums.length){
            int correctIndex= nums[i]-1;
            if(nums[correctIndex]!=nums[i]){
                swap(nums,correctIndex,i);
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if((j+1)!=nums[j]){
                val.add(nums[j]);
            }
        }
        return val;
    }
    public static void swap(int [] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }

}
