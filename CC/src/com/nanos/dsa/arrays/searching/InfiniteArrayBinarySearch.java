package com.nanos.dsa.arrays.searching;

public class InfiniteArrayBinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int ans = findPos(arr,10);

        if (ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);
    }
    public static int findPos(int [] arr, int target){
        int start=0,end=1;
        while (arr[end]<target){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return floorSearch(arr,start,end,target);
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
                low=mid+1;
            }
        }

        return res;
    }

}
