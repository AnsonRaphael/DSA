package com.dsa.week.workshop.week4.hashing;

import java.util.HashMap;

public class MaxDistanceBetweenSameElements {
    public static void main(String[] args) {
        int arr[]={1, 1, 2, 2, 2, 1};
        int n=6;
        System.out.println(maxDistance(arr,n));
    }
   static int maxDistance(int arr[], int n)
    {
        // Your code here
        int max=0;
        HashMap<Integer,Integer> firstoc=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if(firstoc.containsKey(arr[i])){
                int k=firstoc.get(arr[i]);
                int diff=i-k;
                if(max<diff)
                    max=diff;
            }else {
                firstoc.put(arr[i],i);
            }
        }
        return max;
    }
}
