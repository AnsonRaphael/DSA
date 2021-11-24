package com.nanos.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr={4,2,1,3};
        System.out.println(minimumAbsDifference(arr));
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int m=Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=1;i--){
            if((arr[i]-arr[i-1])<m)
                m=arr[i]-arr[i-1];
        }
        List<List<Integer>> res =new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==m){
                List<Integer> pair =new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                res.add(pair);
            }
        }
        return res;
    }
}
