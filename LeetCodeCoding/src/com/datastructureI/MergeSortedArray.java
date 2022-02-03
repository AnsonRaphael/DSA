package com.datastructureI;

public class MergeSortedArray{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int[] nums3=new int[m];
        for(int l=0;l<m;l++){
            nums3[l]=nums1[l];
        }
        while(i<m&&j<n){
            if(nums3[i]<=nums2[j]){
                nums1[k]=nums3[i];
                i++;
                k++;
            }else{
                nums1[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<m){

            nums1[k]=nums3[i];
            i++;
            k++;

        }
        while(j<n){
            nums1[k]=nums2[j];
            j++;
            k++;
        }

    }
}
