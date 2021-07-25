package com.dsa.week.workshop.week1.array.problems;

public class FindTransitionPoint {
    public static void main(String[] args) {
    int arr[] = {1,1,1,1,1};
    int n=5;
    System.out.println(transitionPoint(arr,n));
    }
    static int transitionPoint(int arr[], int n) {
        // code here
        if(arr[0]==1)
            return 0;
        int left=0,right=n,mid=0;
        boolean flag=false;
        while(left<right){
            mid=(left+right)/2;
            if(arr[mid]==1&&arr[mid-1]==0){
                flag=true;
                break;
            }
            if(arr[mid]==0){
                left=mid+1;
            }
            if(arr[mid]==1){
                right=mid;
            }
        }
        if(flag)
        return mid;
        else
            return -1;
    }
}
