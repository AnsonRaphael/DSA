package com.nanos.dsa.arrays.searching.binaryleetcode;

public class DivideChocolate {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9}; int m=5;
        System.out.println(maximizeSweetness(nums,m));
    }
    public static int maximizeSweetness(int[] nums, int m) {
        long l=0,r=0,mid=0;
        for (int n:nums){
            r+=n;
            l=Math.min(n,l);
        }
        while (l<=r){
            mid=l+(r-l)/2;
            if(canSplit(nums,m, (int) mid)){
                l=mid+1;
            }else {
                r=mid-1;
            }
        }
        if(canSplit(nums, m, (int) r)) return (int)r;
        else return (int)l;
    }

    private static boolean canSplit(int[] nums, int m, int mid) {
        long sum = 0, cnt = 0;
        for (int i=0;i<nums.length;i++){
            if(sum+nums[i]>mid){
                cnt++;
                sum=0;
            }else {
                sum+=nums[i];
            }
        }
        return cnt>=m;
    }
}
