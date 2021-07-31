package com.dsa.week.workshop.week2;

public class FindPeakElementInSortedArray {
    public static void main(String[] args) {
        int arr[]={0, 20, 15, 2, 23, 90, 67};
        System.out.println(findpeak(arr,0,arr.length-1));
    }
    static int findpeak(int arr[], int lef,int righ){
        int mid=(lef+righ)/2;
        if((mid==0||arr[mid-1]<arr[mid])&&(mid==arr.length-1||arr[mid+1]<arr[mid])){
            return arr[mid];
        }
        // left side is peak
        else if(mid>0&&arr[mid]<arr[mid-1]){
            return findpeak(arr,lef,mid-1);
        }else {
            return findpeak(arr,mid+1,righ);
        }

    }
}
