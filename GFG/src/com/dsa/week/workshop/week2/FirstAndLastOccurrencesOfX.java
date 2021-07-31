package com.dsa.week.workshop.week2;

import java.util.ArrayList;

public class FirstAndLastOccurrencesOfX {
    public static void main(String[] args) {
      int  n=30, x=8;
        long arr[] = {1, 1, 1,2 ,3, 3, 3, 4 ,4 ,4 ,4 ,4 ,5, 5, 6 ,7 ,7 ,7 ,8 ,8 ,8 ,8 ,9, 9 ,9, 9 ,9 ,10, 10, 10 };
        System.out.println(find(arr,n,x));
    }
    static ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> result=new ArrayList<>();
        long f=firstOccurance(arr,n,x);
        long l=lastOccurance(arr,n,x);
        result.add(f);
        result.add(l);
        return result;
    }
    static long firstOccurance(long arr[],int n,int x){
        boolean flag=false;
        int lef=0,righ=n-1,mid=0,res=0;
       while (lef<=righ){
           mid=(lef+righ)/2;
           if(arr[mid]==x&&(mid==0||arr[mid-1]!=x)){
               flag=true;
               break;
           }
           if (arr[mid]<x){
               lef=mid+1;
           }else{
               righ=mid-1;
           }
       }
       if(flag)
           return mid;
       else
           return -1;
    }
    static long lastOccurance(long arr[],int n,int x){
        boolean flag=false;
        int lef=0,righ=n-1,mid=0;
        while (lef<=righ){
            mid=(lef+righ)/2;
            if(arr[mid]==x&&(mid==n-1||arr[mid+1]!=x)){
                flag=true;
                break;
            }
            if (arr[mid]>x){
                righ=mid-1;
            }else{
                lef=mid+1;
            }
        }
        if(flag)
            return mid;
        else
            return -1;
    }
}
