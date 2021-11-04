package com.nanos.dsa.arrays.searching.binaryleetcode;

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanEqualX {
    public static void main(String[] args) {
        int[] nums={1,0,0,6,4,9};
        //int[] nums={3,9,7,8,3,8,6,6};

        System.out.println(specialArray1(nums));
    }
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int l=0,r=nums.length-1,m=0,t=0;
        while(l<=r){
            m=l+(r-l)/2;
            int k=search(nums,nums[m]);
            if(k!=-1)
                m=k;
            t=nums.length-m;

            int fo=search(nums,t);
            System.out.println(l+" "+r+" "+m+" "+t+" "+nums[m]+" "+fo+" "+k);

            if(k!=-1)
                m=k;
            System.out.println(l+" "+r+" "+m+" "+t+" "+nums[m]+" "+fo+" "+k);
            if(t<=nums[m]&&(fo==m||fo==-1)){
                return t;
            }
            if(t>=m){
               l=m+1;
            }else{
                r=m-1;
            }
        }

        return -1;
    }

    public static int search(int[] nums, int target) {
        int l=0,r=nums.length-1,m=0;
        while(l<=r){
            m=l+(r-l)/2;
            if(nums[m]==target&&(m==0||nums[m-1]!=nums[m])){
                return m;
            }
            if(nums[m]<target){
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return -1;
    }
    public static int lower(int[] nums, int target) {
        int l=0,r=nums.length-1,m=0,res=-1;
        while(l<=r){
            m=l+(r-l)/2;
            if(nums[m]==target){
                return m;
            }
            if(nums[m]<target){
                l=m+1;
            }else{
                res=m;
                r=m-1;
            }
        }
        return res;
    }


    public static int specialArray1(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int l=0,r=nums.length-1,m=0,t=0,res=-1;
      for(int i=0;i<nums.length;i++){

          int pos= lower(nums,i);

          int cnt=nums.length-pos;
          System.out.println(i+" "+pos+" "+cnt);
          if(cnt==i)
              return i;
      }

        return -1;
    }
}
