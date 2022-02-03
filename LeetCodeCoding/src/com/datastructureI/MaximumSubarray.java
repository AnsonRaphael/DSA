package com.datastructureI;

public class MaximumSubarray {
    public static void main(String[] args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubArray(a ));
    }
    public static int maxSubArray(int[] nums) {
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(max<sum)
                max=sum;
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
