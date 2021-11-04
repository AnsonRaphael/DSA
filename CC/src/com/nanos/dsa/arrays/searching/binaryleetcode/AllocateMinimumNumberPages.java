package com.nanos.dsa.arrays.searching.binaryleetcode;

public class AllocateMinimumNumberPages {
    public static void main(String[] args) {
        int arr[] = {12, 34, 67, 90};

        int m = 2; //No. of students

        System.out.println("Minimum number of pages = " +
                findPages(arr, arr.length, m));
    }

    private static int findPages(int[] arr, int length, int m) {
        int sum=0;
        for (int i=0;i<length;i++){
            sum+=arr[i];
        }

        int l=0,r=sum,mid=0,res=0;
        while (l<=r){

            mid=l+(r-l)/2;
            //System.out.println(l+" "+r+" "+mid);
            if(ifPossible(mid,arr,m)){
                r=mid-1;
                res=mid;
            }else {
                l=mid+1;
            }
        }
        return res;
    }

    private static boolean ifPossible(int mid, int[] arr, int m1) {
        int stcont=1,page=0;
        for (int i=0;i<arr.length;i++){

            if (arr[i] > mid)
                return false;
           //System.out.println(" ---- "+page+" "+mid);
            if(page+arr[i]>mid){
                page=arr[i];
                stcont++;
                if(stcont>m1){
                    return false;
                }
            }else
                page+=arr[i];
        }
        return true;
    }
}
