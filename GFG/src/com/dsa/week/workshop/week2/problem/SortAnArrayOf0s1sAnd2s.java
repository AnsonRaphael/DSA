package com.dsa.week.workshop.week2.problem;

import java.util.Arrays;

public class SortAnArrayOf0s1sAnd2s {
    public static void main(String[] args) {
        int n = 5;
        int arr[]= {0 ,2 ,1 ,2 ,0};
        sort012(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort012(int a[], int n)
    {
        // code here
        int z=0,o=0,t=0;
        for (int i=0;i<n;i++){
            if(a[i]==0){
                z++;
            }else if (a[i]==1){
                o++;
            }else if(a[i]==2){
                t++;
            }
        }
        for (int i=0;i<n;i++){
            if(z>0){
                a[i]=0;
                z--;
            }else if(o>0){
                a[i]=1;
                o--;
            }else if(t>0){
                a[i]=2;
                t--;
            }
        }
    }
}
