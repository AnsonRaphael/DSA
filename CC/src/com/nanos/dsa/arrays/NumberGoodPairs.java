package com.nanos.dsa.arrays;

public class NumberGoodPairs {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int sum=0;
        int[] count= new int[101];
        for(int i=0;i<nums.length;i++){
            ++count[nums[i]];
        }
        for(int i=0;i<101;i++){
            if(count[i]>1){
                sum+=ncr(count[i]);
            }
        }
        return sum;
    }
    public static int ncr(int n){
        if(n<=2)
            return 1;
        return (n)*(n-1)/2;
    }
}
