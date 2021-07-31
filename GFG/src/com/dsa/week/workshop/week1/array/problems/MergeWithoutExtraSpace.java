package com.dsa.week.workshop.week1.array.problems;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
   int  n = 4;
   long arr1[] = {1 ,3 ,5 ,7};
   int m = 5;
   long arr2[] = {0 ,2 ,6, 8, 9};
   int a[];


    }
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        // code here
        int pt1=0,pt2=0;
        while(pt1<n&&pt2<m){
            if(arr1[pt1]<arr2[pt2]){
                pt1++;
            }else{
                long t=arr1[pt1];
                arr1[pt1]=arr2[pt2];
                arr2[pt2]=t;
                pt1++;
            }
        }
    }

    private static void display(long arr1[], long arr2[], int n, int m){
        for(int i=0;i<n;i++)
            System.out.print(arr1[i]+" ");
        for(int i=0;i<3;i++)
            System.out.print(arr2[i]+" ");
        System.out.println("");

    }
}
