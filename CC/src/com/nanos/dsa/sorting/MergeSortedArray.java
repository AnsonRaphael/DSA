package com.nanos.dsa.sorting;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int totalSize=m+n,tsp=m+n-1;;
        int pom=m-1,pon=n-1;
        while(pom>=0&&pon>=0){
            if(nums1[pom]>nums2[pon]){
                nums1[tsp]=nums1[pom];
                tsp--;
                pom--;
            }else{
                nums1[tsp]=nums2[pon];
                tsp--;
                pon--;
            }
        }

        while(pon>=0){
            nums1[tsp]=nums2[pon];
            tsp--;
            pon--;
        }
    }
}
