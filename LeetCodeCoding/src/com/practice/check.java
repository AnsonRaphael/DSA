package com.practice;

import java.util.Arrays;

public class check {
    public static void main(String[] args) {
        int[] nums={2,67,3,9,01,35,6};
        //System.out.println(Arrays.toString(mergesort(nums,0,nums.length)));
//        mergesort1(nums,0,nums.length-1);
//        System.out.println(Arrays.toString(nums));
        int[] num={2,0,1,4,3};

        for (int i = 0; i < num.length; ) {
            int index=num[i];
           if(index<num.length&&index!=i){
               swap(num,index,i);
           }else{
               i++;
           }
        }
        System.out.println(Arrays.toString(num));
    }

    private static void swap(int[] num, int index, int i) {
        int t=num[index];
        num[index]=num[i];
        num[i]=t;
    }

    public static int[] mergesort(int[] nums,int s,int e){
      if(e-s<2)
          return Arrays.copyOfRange(nums,s,e);
      int m=s+(e-s)/2;
      int[] left=mergesort(nums,s,m);
      int[] right=mergesort(nums,m,e);

      return merge(left,right);

    }

    private static int[]  merge(int[] left, int[] right) {
        int[] res= new int[left.length+right.length];
        int l=0,r=0,k=0;
        while (l<left.length&&r<right.length){
            if(left[l]<right[r]){
                res[k]=left[l];
                l++;
            }else{
                res[k]=right[r];
                r++;
            }
            k++;
        }
        while (l<left.length){
            res[k]=left[l];
            l++;
            k++;
        }
        while (r<right.length){
                res[k]=right[r];
                r++;
                k++;
        }
        return res;
    }






    public static void mergesort1(int[] nums,int s,int e){
        if(e-s<2)
            return ;
        int m=s+(e-s)/2;
        mergesort1(nums,s,m);
        mergesort1(nums,m,e);
        merge1(nums,s,m,e);

    }

    private static void   merge1(int[] nums,int s,int m,int e) {


        int[] res= new int[e-s];
        int l=s,r=m,k=0;
        while (l<m&&r<e){
            if(nums[l]<=nums[r]){
                res[k]=nums[l];
                l++;
            }else{
                res[k]=nums[r];
                r++;
            }
            k++;
        }
        while (l<m){
            res[k]=nums[l];
            l++;
            k++;
        }
        while (r<e){
            res[k]=nums[r];
            r++;
            k++;
        }
        int mk=s;
        for (int i = 0; i < k; i++) {
            nums[mk]=res[i];
            mk++;
        }
    }
}
