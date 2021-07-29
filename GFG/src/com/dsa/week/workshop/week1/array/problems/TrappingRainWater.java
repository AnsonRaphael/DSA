package com.dsa.week.workshop.week1.array.problems;

public class TrappingRainWater {
    public static void main(String[] args) {
      int  n = 7;
      int arr[] = {8 ,8 ,2, 4 ,5 ,5, 1};
      System.out.println(trappingWater(arr,n));
    }
    static int trappingWater(int arr[], int n) {

        // Your code here
        int maxarr[] = new int[n];
        int maxr=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>maxr){
                maxr=arr[i];
            }
            maxarr[i]=maxr;
        }
        int maxl=arr[0];
        int result=0;
        for(int i=0;i<n;i++){
            if(arr[i]>maxl){
                maxl=arr[i];
            }
            int sum=Math.min(maxl,maxarr[i])-arr[i];
            if(sum>0);
            result+=sum;
        }
        return result;
    }
}
