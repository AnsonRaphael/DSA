package com.nanos.dsa.arrays.searching.binaryleetcode;

public class MedianTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1={1,3}; int[] nums2={2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        if(n>m){
            return findMedianSortedArrays(nums2,nums1);
        }
        int realMid=(n+m+1)/2;
        int start=0,end=n;
        while (start<=end){
            int leftASize=(start+end)/2; // median of array1
            int leftBSize= (realMid)-leftASize;
            int leftA=(leftASize>0)?nums1[leftASize-1]:Integer.MIN_VALUE;
            int leftB=(leftBSize>0)?nums2[leftBSize-1]:Integer.MIN_VALUE;
            int rightA=(leftASize<n)?nums1[leftASize]:Integer.MAX_VALUE;
            int rightB=(leftBSize<m)?nums2[leftBSize]:Integer.MAX_VALUE;
            if(leftA<=rightB&&leftB<=rightA){
                if((n+m)%2==0){
                    return (Math.max(leftA,leftB)+Math.min(rightA,rightB))/2.0;
                }
                return Math.max(leftA,leftB);
            }
            else if(leftA>rightB){
                end=leftASize-1;
            }else {
                start=leftASize+1;
            }
        }
        return 0.0;
    }
}
