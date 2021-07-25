package com.dsa.week.workshop.week1.array.problems;

import java.util.ArrayList;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,0};
        int n=5;
        display(leaders1(arr,n));
    }
    // reverse order
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[n-1]);
        int maxsum=arr[n-1];
        for (int i=n-1;i>=0;i--){
            if(arr[i]>maxsum){
                result.add(arr[i]);
                maxsum=arr[i];
            }
        }
        return result;
    }

    private static void display(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++)
            System.out.print(arr.get(i)+" ");
        System.out.println("");

    }
    // same order
    static ArrayList<Integer> leaders1(int arr[], int n){
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        int max[] = new int[n];
        int maxsum=0;
        for (int i=n-1;i>=0;i--){
            if(arr[i]>maxsum){
                maxsum=arr[i];
            }
            max[i]=maxsum;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==max[i])
                result.add(arr[i]);
        }

        return result;
    }
}
