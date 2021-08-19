package com.nanos.dsa.arrays;

import java.util.Arrays;

public class SmallerNumbersThanCurrentNumber {
    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent1(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] res= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]>nums[j])
                        count++;
                }
            }
            res[i]=count;
        }
        return res;
    }
    public static int[] smallerNumbersThanCurrent1(int[] nums) {
        int [] res= new int[nums.length];
        int [] count=new int[101];
        for(int i=0;i<nums.length;i++){
            ++count[nums[i]];
        }
        for(int i=1;i<101;i++){
            count[i]+=count[i-1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                res[i]=0;
            else
            res[i]=count[nums[i]-1];
        }
        return res;
    }
}
