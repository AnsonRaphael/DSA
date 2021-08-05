package com.dsa.week.workshop.week2.problem;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int n = 6;
        int arr1[] = {1,1,2, 3, 4, 5};
        int m = 3;
        int arr2 [] = {1, 2, 3};
        System.out.println(findUnion1(arr1,arr2,n,m));
    }
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here

        Set<Integer> resSet= new LinkedHashSet<>();

        int i=0,j=0,k=0;
        for (;i<n&&j<m;k++){
             if(arr1[i]<arr2[j]){
                 resSet.add(arr1[i]);
                i++;
            }else {
                 resSet.add(arr2[j]);
                j++;
            }
        }

        while (i<n){
            resSet.add(arr1[i]);
            i++;
            k++;
        }

        while (j<m){
            resSet.add(arr2[j]);
            j++;
            k++;
        }

        return  new ArrayList<>(resSet);
    }
    public static ArrayList<Integer> findUnion1(int arr1[], int arr2[], int n, int m)
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
            resSet.add(arr1[i]);
            prev=arr1[i];
            i++;
        }else {
            resSet.add(arr2[j]);
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
                resSet.add(arr1[i]);
                prev=arr1[i];
                i++;
            }else {
                resSet.add(arr2[j]);
                prev=arr2[j];
                j++;
            }
        }

        while (i<n){
            if(arr1[i]!=prev){
                resSet.add(arr1[i]);
                prev=arr1[i];
            }

            i++;
            k++;
        }

        while (j<m){
            if(arr2[j]!=prev){
                resSet.add(arr2[j]);
                prev=arr2[j];
            }

            j++;
            k++;
        }

        return  resSet;
    }
}
