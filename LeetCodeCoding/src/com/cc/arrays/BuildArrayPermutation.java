package com.cc.arrays;

import java.util.Arrays;

public class BuildArrayPermutation {
    public static void main(String[] args) {
        int [] arr={5,2,1,0,3,4};
        System.out.println(Arrays.toString((arr)));
        System.out.println(Arrays.toString(buildArray(arr)));
        System.out.println(Arrays.toString(buildArray1(arr)));
    }
    public static int[] buildArray(int[] nums) {
        int [] res=new int[nums.length];
        for (int i=0;i<nums.length;i++){
                res[i]=nums[nums[i]];
        }
        return res;
    }
    public static int[] buildArray1(int[] nums) {

        for (int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                int j=i,t=nums[i];
                while(nums[j]!=i && nums[j]>0){
                    int k=nums[j];
                    nums[j]=-nums[k];
                    j=k;
                }
                nums[j]=-t;
            }
        }
        for (int i=0;i<nums.length;i++){
            if(nums[i]<0)
                nums[i]*=-1;
        }

        return nums;
    }
}
