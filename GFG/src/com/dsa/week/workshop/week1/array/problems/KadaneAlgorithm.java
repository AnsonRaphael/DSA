package com.dsa.week.workshop.week1.array.problems;

public class KadaneAlgorithm {
    public static void main(String[] args) {
      int  n = 4;
        int arr[] = {-6,-2,-3,-4};
        System.out.println(maxSubarraySum(arr,n));
    }
    static int maxSubarraySum(int arr[], int n){
        // Your code here
        int maxCurr=0,maxSoFar=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxCurr += arr[i];
            if(maxSoFar<maxCurr){
                maxSoFar=maxCurr;
            }
            if(maxCurr<0){
             maxCurr=0;
            }

        }

    return maxSoFar;
    }
}
