package com.dsa.week.workshop.week1.array;

public class RangeSumQueriesUsingPrefixSum {
    public static void main(String[] args) {
        int [] arr = {4, 5, 3, 2, 5};
        int [] prefixSum = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i==0)
            prefixSum[i]=prefixSum[0]+arr[i];
            else
                prefixSum[i]=prefixSum[i-1]+arr[i];
        }

        int a=1,b=3;
        if(a==0)
        System.out.println(prefixSum[b]);
        else
            System.out.println(prefixSum[b]-prefixSum[a-1]);
    }

}
