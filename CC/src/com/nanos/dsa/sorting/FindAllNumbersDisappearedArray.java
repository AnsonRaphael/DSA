package com.nanos.dsa.sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedArray {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> rus= new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++) {
            int t=nums[i];
            if(t<0) {
                t=-1*t;
            }
            t=t-1;
            if(nums[t]>=0) {
                nums[t]=-1*nums[t];
            }
        }
        for(int i=0;i<nums.length;i++) {

            if(nums[i]>0) {
                rus.add(i+1);
            }
        }
        return rus;

    }
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        int i=0;
        List<Integer> res = new ArrayList<>();
        while(i<nums.length){
            int correctIndex =nums[i]-1;
            if(nums[correctIndex]!=nums[i]){
                swap(nums,correctIndex,i);
            }else{
                i++;
            }
        }

        for(int j=0;j<nums.length;j++){
            if((j+1)!=nums[j]){
                res.add(j+1);
            }
        }
        return res;
    }
    public static void swap(int [] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}
