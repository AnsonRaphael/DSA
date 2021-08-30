package com.nanos.dsa.arrays.searching;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int m=2;
        System.out.println(splitArray(nums,m));
    }
    public static int splitArray(int[] nums, int m) {
        // lowest and highest possible sums (with lowest and highest m values)
        int start=0,end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }

        //  binary search potential answers
        while(start<end){
            int mid=start+(end-start)/2;
            int portion=1;
            int sum=0;
            // find number of subarray sums without exceeding mid value
            for(int num:nums){
                if(sum+num>mid){
                    portion++;
                    sum=num;
                }else{
                    sum+=num;
                }
            }
            // means we numbers in sub arrays are larger values  and to make portions larger so we need to look for smaller potential answers
            if(portion<=m){
                end=mid;

            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
