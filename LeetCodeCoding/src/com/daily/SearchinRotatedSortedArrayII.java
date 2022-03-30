package com.daily;

public class SearchinRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target=2;
        //System.out.println(search(nums,target));
        System.out.println(nums[pivot(nums)]);
    }
    public  static boolean search(int[] nums, int target) {
        int pivot=pivot(nums);
        if(pivot == -1)
            return biSearch( nums, target, 0, nums.length-1);

        if (nums[pivot] == target)
            return true;
        boolean lm=biSearch(nums,0,pivot,target);
        if(lm)
            return true;
        boolean rm=false;
        if(pivot!=nums.length-1)
        rm = biSearch(nums,pivot+1,nums.length-1,target);
        return rm;
    }
    public static boolean biSearch(int[]nums,int s,int e,int target){
        while (s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                return true;
            }
            if(nums[m]>target){
                e=m-1;
            }else {
                s=m+1;
            }
        }
        return false;
    }

    public static int pivot(int[] nums){
        int s=0,e=nums.length-1,m=0,res=0;
        while (s<=e){
            m=s+(e-s)/2;
            if(m<nums.length-1&&nums[m]>nums[m+1]){
                res=m;
                break;
            }
            if(m>0&&nums[m-1]>nums[m]){
                res=m-1;
                break;
            }
            if (nums[s]==nums[m]&&nums[m]==nums[e]){

                if(s<e&&nums[s]>nums[s+1]){
                    res=s;
                    break;
                }
                s++;
                if(e>s&&nums[e-1]>nums[e]){
                    res=e-1;
                    break;
                }
                e--;
            }else if(nums[s]<nums[m]||(nums[s]==nums[m]&&nums[m]>nums[e])){
                s=m+1;
            }else {
                e=m-1;
            }
        }
        return res;
    }
}
