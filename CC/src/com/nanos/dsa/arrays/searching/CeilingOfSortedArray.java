package com.nanos.dsa.arrays.searching;

public class CeilingOfSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int n = arr.length;
        int x = 0;
        int index = ceilSearch(arr, 0, n-1, x);
        if(index == -1)
            System.out.println("Ceiling of "+x+" doesn't exist in array");
        else
            System.out.println("ceiling of "+x+" is "+arr[index]);
    }
    static int ceilSearch(int arr[], int low, int high, int x){
        int mid=0,res=-1;
        while (low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){
                res=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return res;
    }

}
