package com.nanos.dsa.arrays.searching.binaryleetcode;

public class SingleElementASortedArray {
    public static void main(String[] args) {
        int[] nums={3,3,7,10,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        int l=0,r=nums.length-1,m=0;
        while(l<=r){
            m=l+(r-l)/2;

            if((m==0||nums[m-1]!=nums[m])&&(m==nums.length-1||nums[m+1]!=nums[m])){
                return nums[m];
            }


            if((m)%2==0){
                if(nums[m]==nums[m+1]){
                    l=m+1;
                }else{
                    r=m-1;
                }

            }else{
                if(nums[m]==nums[m-1]){
                    l=m+1;
                }else{
                    r=m-1;
                }
            }
            System.out.println(m+" "+nums[m-1]+" "+nums[m]+" "+nums[m+1]+" "+l+" "+r);
        }
        return -1;
    }
}
