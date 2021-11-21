package com.nanos.dsa.sorting;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] nums={3,2,3,4};
        System.out.println(largestPerimeter(nums));
    }
    public static int largestPerimeter(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        for(int j=nums.length-1;j>=2;j--){
            if(check(nums,j)){
                sum=nums[j]+nums[j-1]+nums[j-2];
                break;
            }
        }
        return sum;
    }
    public static boolean check(int[] nums,int j){
        int a=nums[j],b=nums[j-1],c=nums[j-2];
        int ab=a+b,bc=b+c,ca=c+a;
        if(a<bc&&b<ca&&c<ab){
            return true;
        }
        return false;
    }
}
