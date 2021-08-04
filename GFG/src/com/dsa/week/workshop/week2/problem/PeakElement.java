package com.dsa.week.workshop.week2.problem;

public class PeakElement {
    public static void main(String[] args) {
        int n = 7;
        int arr[] = {14 ,14, 10 ,4 ,13, 8, 17};
        System.out.println(peakElement(arr,n));
    }
   static public int peakElement(int[] arr,int n)
    {
        //add code here.
        int result=-1;
        int l=0,r=n-1,mid=0;
        while (l<=r){
            mid=l+(r-l)/2;
            //System.out.println(mid+" "+l+" "+r+" "+arr[mid]);
            if((mid==0||arr[mid-1]<=arr[mid])&&(mid==n-1||arr[mid+1]<=arr[mid])){
                result=mid;
                break;
            }

            if((mid==0||arr[mid-1]<arr[mid])){
                l=mid+1;
            }else {
                r=mid-1;
            }
        }
        return result;
    }
}
