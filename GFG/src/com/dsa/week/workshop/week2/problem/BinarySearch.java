package com.dsa.week.workshop.week2.problem;

public class BinarySearch {
    public static void main(String[] args) {
        int n = 5,k = 4;
        int arr[] = {1 ,2 ,3 ,4 ,5};
        System.out.println(binarysearch(arr,n,k));
    }
   static int binarysearch(int arr[], int n, int k){
        // code here
        int result =-1;

        int l=0,r=n-1,mid=0;
        while (l<=r){
            mid=(l+r)/2; //l+(r-l)/2
            if(arr[mid]==k){
                result=mid;
                break;
            }
            if(arr[mid]>k){
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return result;
    }
}
