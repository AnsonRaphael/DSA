package com.dsa.week.workshop.week2.problem;

import java.util.Arrays;

public class MinimumPlatforms {
    public static void main(String[] args) {
//        int n = 6;
//        int arr[] = {900, 940, 950, 1100, 1500, 1800};
//        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        int n = 3;
        int arr[] = {900, 1100, 1235};
        int dep[] = {1000, 1200, 1240};
        System.out.println(findPlatform(arr,dep,n));
    }

    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0,j=0,max=0,curr=0;
        for (;i<n&&j<n;){

            if(arr[i]<=dep[j]){
                i++;
                curr++;
            }else {
                curr--;
                j++;
            }
            if(max<curr)
                max=curr;
        }

        return max;
    }
}
