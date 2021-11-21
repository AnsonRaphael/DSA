package com.nanos.dsa.sorting;

import java.util.Arrays;

public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] nums={4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
        System.out.println(Arrays.toString(sortArrayByParityII2(nums)));
    }
    public static int[] sortArrayByParityII(int[] nums) {
        int f=0,l=nums.length-1,pos=0;
        while(f<l){
            if(nums[f]%2!=0&&f%2==0){
                pos=f;
                while(pos<l){
                    if(nums[pos]%2==0&&pos%2!=0){
                        break;
                    }
                    pos++;
                }
                int t=nums[f];
                nums[f]=nums[pos];
                nums[pos]=t;
            }else if(nums[f]%2==0&&f%2!=0){
                pos=f;
                while(pos<l){
                    if(nums[pos]%2!=0&&pos%2==0){
                        break;
                    }
                    pos++;
                }
                int t=nums[f];
                nums[f]=nums[pos];
                nums[pos]=t;
            }
            f++;

        }
        return nums;
    }

    public static int[] sortArrayByParityII2(int[] nums) {
        int e=0,o=1;
        while (e<nums.length&&o<nums.length){
            if(nums[e]%2!=0&&nums[o]%2==0){
                swap(nums,e,o);
            }
            if(nums[e]%2==0){
                e+=2;
            }
            if(nums[o]%2!=0){
                o+=2;
            }

        }
        return nums;
    }

    private static void swap(int[] nums, int e, int o) {
        int t=nums[e];
        nums[e]=nums[o];
        nums[o]=t;
    }
}
