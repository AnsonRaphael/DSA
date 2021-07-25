package com.dsa.week.workshop.week1.array.problems;

import java.util.Arrays;

public class FirstRepeatingElement {
    public static void main(String[] args) {
       int n = 6;
       int arr[] = {1, 1 ,2, 2, 3 ,3};
       System.out.println(firstRepeated(arr,n));
    }
    public static int firstRepeated(int []arr, int n)
    {
        //Your code here

        int soarr[] = arr.clone();
        Arrays.sort(soarr);
        for (int i=0;i<n;i++){
            int s=arr[i];
            int left=0,right=n,mid=0;
            boolean flag=false;
            while (left<right){
                mid=(left+right)/2;
                if(soarr[mid]==s){

                    if(((mid-1)>=0&&soarr[mid-1]==s)||((mid+1)<n&&soarr[mid+1]==s)){
                        return i+1;
                    }
                    break;
                }
                if(soarr[mid]>s){
                    right=mid-1;
                }
                if(soarr[mid]<s){
                    left=mid+1;
                }
            }

        }
        return -1;
    }
}
