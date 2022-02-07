package com.DP;

public class MaximumSumCircularSubarray {
    public static void main(String[] args) {
        int[] nums = {5,-3,5};
        System.out.println(maxSubarraySumCircular(nums));
    }
    public static int maxSubarraySumCircular(int[] nums) {
        // total sum
        int totalSum=0;
        for (int i = 0; i < nums.length; i++) {
            totalSum+=nums[i];
        }
        // option 1
        int ml=maxSubarraySumOptn1(nums);

        // fin continues negative value;
        for (int i = 0; i < nums.length; i++) {
            nums[i]=-nums[i];
        }
        int neg=maxSubarraySumOptn1(nums);

        int res=totalSum+neg;

        // if all are negative
        if(totalSum==-neg)
            res= totalSum;

        return Math.max(ml,res);
    }

    public static int maxSubarraySumOptn1(int[] nums){
        int max=Integer.MIN_VALUE,sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(sum>max)
                max=sum;
            if(sum<0)
                sum=0;
        }
        return max;
    }
}
