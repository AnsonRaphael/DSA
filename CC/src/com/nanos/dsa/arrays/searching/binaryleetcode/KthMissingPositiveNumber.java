package com.nanos.dsa.arrays.searching.binaryleetcode;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,11};
        int k=5;
        System.out.println(findKthPositive(arr,k));
    }
    public static int findKthPositive(int[] arr, int k) {
        int l=arr[0],r=arr[arr.length-1];
        int count=l-1;
        if(k<=count){
            return k;
        }
        for(int i=0;i<arr.length-1;i++){
            int m = arr[i];
            int n=arr[i+1];
            int s=n-m-1;
            count+=s;
            if(k<=count){
                count=count-k;
                return n-count-1;
            }
        }

        count=k-count;
        return r+count;

    }
}
