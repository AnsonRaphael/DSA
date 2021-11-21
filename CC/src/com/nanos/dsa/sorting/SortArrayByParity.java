package com.nanos.dsa.sorting;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums={3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
        System.out.println(Arrays.toString(sortArrayByParity2(nums)));

    }
    public static int[] sortArrayByParity(int[] nums) {
        int f=0,l=nums.length-1;
        while(f<l){
            if(nums[f]%2!=0){
                int t=nums[f];
                nums[f]=nums[l];
                nums[l]=t;
                l--;
            }else{
                f++;
            }
        }
        return nums;
    }
    public static int[] sortArrayByParity2(int[] A) {
        if(null == A || A.length < 2) return A;
        int pos=0;
        for(int i=0;i<A.length;i++) {
            if(A[i]%2==0) {
                int temp=A[pos];
                A[pos]=A[i];
                A[i]=temp;
                pos++;
            }
        }
        return A;
    }
}
