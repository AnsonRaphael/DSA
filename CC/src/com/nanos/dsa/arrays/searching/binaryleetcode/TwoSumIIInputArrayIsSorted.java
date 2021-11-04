package com.nanos.dsa.arrays.searching.binaryleetcode;

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
        System.out.println(Arrays.toString(twoSum1(numbers,target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int res[] = new int[2];
        for (int i=0;i<numbers.length;i++){
            int val=target-numbers[i];
            int resn=binSearch(numbers,val,i);
            if(resn>=0){
                res[0]=i+1;
                res[1]=resn+1;
                return res;
            }
        }
        return res;
    }
    static int binSearch(int arr[], int x,int i){
        int low=0,high=arr.length,mid=0,res=-1;
        while (low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==x&& mid!=i){
                return mid;
            }
            if(arr[mid]>x){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }

    public static int[] twoSum1(int[] numbers, int target) {
        int res[] = new int[2];
        int l=0,r=numbers.length-1,m;
        while (l<r){
            int sum =numbers[l]+numbers[r];
            if(sum==target){
                res[0]=l+1;
                res[1]=r+1;
                return res;
            }
            if(sum<target){
                l++;
            }else {
                r--;
            }
        }
        return res;
    }
}
