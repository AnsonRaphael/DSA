package com.dsa.week.workshop.week2;

import java.util.Arrays;

// Java Program to maximize the
// number of toys with K amount
//https://practice.geeksforgeeks.org/problems/maximize-toys0331/1
public class MaximizeToys {
    public static void main(String[] args) {
      int  N = 7;
        int K = 50;
        int  arr[] = {1, 12, 5, 111, 200, 1000, 10};
        System.out.println(toyCount(N,K,arr));
    }
    static int toyCount(int N, int K, int arr[])
    {
        // code here
        Arrays.sort(arr);
        int result=0;
        for(int i=0;i<N;i++){
            if (arr[result]<=K){
                K=K-arr[result];
                result++;
            }
        }
        return result;
    }
}
