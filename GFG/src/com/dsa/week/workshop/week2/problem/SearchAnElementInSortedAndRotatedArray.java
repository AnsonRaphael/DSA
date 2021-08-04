package com.dsa.week.workshop.week2.problem;

public class SearchAnElementInSortedAndRotatedArray {
    public static void main(String[] args) {
        int n = 3;
        //int arr[] = {5,6,7,8,9,10,1,2,3};
        int arr[] = {3,1,2};
        int k = 5;
        System.out.println(Search(arr,k));
    }

    static int Search(int array[], int target)
    {
        // code here
        int arr[]=array;
        int pov=0,min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                pov=i;
                min=arr[i];
            }
        }

        if(pov==0)
            pov=1;

        reverse(arr,0,pov-1);

        reverse(arr,pov,arr.length-1);

        reverse(arr,0,arr.length-1);

        int k=binarySearch(arr,target);

        if(k<0)
            return -1;
        else
        return (k+pov)%arr.length;
    }

    static void reverse(int arr[],int l,int r){
        while(r>l){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            r--;
            l++;
        }
    }

    static int binarySearch(int arr[],int k){
      int result=-1;
      int l=0,r=arr.length-1,mid=0;
      while (l<=r){
          mid=l+(r-l)/2;
          if(arr[mid]==k){
              result=mid;
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
