package com.dsa.week.workshop.week1.array.problems;

public class FindImmediateSmallerThanX {
    public static void main(String[] args) {
        int arr[] = {1, 2 ,3 ,4 ,5};
        int n=5 , x=1;
        System.out.println(immediateSmaller(arr,n,x));
    }
    public static int immediateSmaller(int arr[], int n, int x)
    {
        // Your code here
        int res=-1,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<x){
                if(min>(x-arr[i])){
                    min=x-arr[i];
                    res=arr[i];
                }
            }
        }
        return res;
    }
}
