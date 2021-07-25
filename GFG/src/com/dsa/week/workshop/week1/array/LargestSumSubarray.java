package com.dsa.week.workshop.week1.array;

public class LargestSumSubarray {
    public static void main(String[] args) {
        int [] arr = {-3, 4, -1, -2, 1, 5};
        System.out.println(largestSum(arr));
    }
    public static int largestSum(int []  arr){
        int max_i=0;
        int max_sum=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            max_i+=arr[i];
            if(max_i>max_sum)
                max_sum=max_i;
            if(max_i<0)
                max_i=0;
        }
        return max_sum;
    }
}
