package com.nanos.dsa.arrays.searching;

public class FloorOfSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int n = arr.length;
        int x = 20;
        int index = floorSearch(arr, 0, n-1, x);
        if(index == -1)
            System.out.println("Floor of "+x+" doesn't exist in array");
        else
            System.out.println("Floor of "+x+" is "+arr[index]);
    }
    static int floorSearch(int arr[], int low, int high, int x){
        int mid=0,res=-1;
        while (low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){

                high=mid-1;
            }else {
                res=mid;
                low=mid+1;
            }
        }

        return res;
    }

}
