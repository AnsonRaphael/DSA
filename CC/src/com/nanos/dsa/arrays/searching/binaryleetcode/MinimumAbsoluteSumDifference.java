package com.nanos.dsa.arrays.searching.binaryleetcode;

import java.util.Arrays;

public class MinimumAbsoluteSumDifference {
    public static void main(String[] args) {
        int[] nums1={1,10,4,4,2,7};
        int[] nums2={9,3,5,1,7,4};
        System.out.println(minAbsoluteSumDiff(nums1,nums2));
    }
    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int sum=0;
        int mod= (int) (Math.pow(10,9)+7);
        for (int i=0;i<nums1.length;i++){

            sum=(sum+Math.abs(nums1[i]-nums2[i]))%mod;

        }
        int resSum=sum;

        int[] nums1t = nums1.clone();
        Arrays.sort(nums1t);

        for (int i=0;i<nums2.length;i++){
            int opt =optimal(nums2[i],nums1t,i);
            //System.out.println(nums2[i]+" "+opt);
            int tempSum=(sum-Math.abs(nums1[i]-nums2[i]));
            tempSum=(tempSum+Math.abs(opt-nums2[i]))%mod;
            if(resSum>tempSum){
                resSum=tempSum;
            }

        }
        return (resSum+mod)%mod;
    }

    private static int optimal(int nums2, int[] nums1, int i) {
        int indx=Arrays.binarySearch(nums1,nums2);

        if(indx>=0)
            return nums2;
        else {
            int flor=floor(nums2,nums1);
            int cel=ceil(nums2,nums1);
            //System.out.println(nums2+" "+flor+" "+cel);
            return Math.abs(nums2-flor) >Math.abs(cel-nums2)?cel:flor;
        }
    }

    private static int floor(int nums2, int[] nums1) {
        int l=0,r=nums1.length-1,m=0,res=Integer.MIN_VALUE;
        while (l<=r){
            m=l+(r-l)/2;
            if(nums1[m]<=nums2){
                res=nums1[m];
                l=m+1;
            }else {
                r=m-1;
            }
        }
        return res;
    }

    private static int ceil(int nums2, int[] nums1) {
        int l=0,r=nums1.length-1,m=0,res=Integer.MAX_VALUE;
        while (l<=r){
            m=l+(r-l)/2;
            if(nums1[m]<nums2){

                l=m+1;
            }else {
                res=nums1[m];
                r=m-1;
            }
        }
        return res;
    }


}
