package com.dsa.week.workshop.week1.array.problems;

public class EquilibriumPoint {
    public static void main(String[] args) {
       int n = 1;
       long arr[] = {1};
       System.out.println(equilibriumPoint(arr,n));
    }
    public static int equilibriumPoint(long arr[], int n) {
        // Your code here
        long totalSum=0;
        for (int i=0;i<n;i++){
            totalSum+=arr[i];
        }
        long presum=0;
        int ans=0;
        boolean flag=false;
        for(int i=0;i<n;i++){
            totalSum=totalSum-arr[i];
            if(presum==totalSum){
                ans=i;
                flag=true;
                break;
            }
            presum+=arr[i];
        }
        if(flag)
        return ans+1;
        else
            return -1;
    }
}
