package com.dsa.week.workshop.week2.problem;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int n = 6;
        int arr1[] = {1,1,2, 3, 4, 5};
        int m = 3;
        int arr2 [] = {1, 2, 3};
        System.out.println(printIntersection(arr1,arr2,n,m));
    }

    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> resSet= new ArrayList<>();

        int i=0,j=0,k=0,prev=0;
        if(arr1[i]==arr2[j]){
            resSet.add(arr1[i]);
            prev=arr1[i];
            i++;
            j++;
        }else if(arr1[i]<arr2[j]){

            prev=arr1[i];
            i++;
        }else {

            prev=arr2[j];
            j++;
        }

        for (;i<n&&j<m;k++){
            if(arr1[i]==prev){
                i++;
            }
            else if(arr2[j]==prev){
                j++;
            }
            else if(arr1[i]==arr2[j]){
                resSet.add(arr1[i]);
                prev=arr1[i];
                i++;
                j++;
            }else if(arr1[i]<arr2[j]){

                prev=arr1[i];
                i++;
            }else {

                prev=arr2[j];
                j++;
            }
        }

        return  resSet;
    }
}
