package com.nanos.dsa.arrays;

import java.util.Arrays;

public class FindNUniqueIntegersSumZero {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n) {
        boolean flag=false;
        if(n%2==0){
            flag=true;
        }
        int[] res=new int[n];
        int k=1;
        for(int i=0;i<n-1;){
            if(flag){
               flag=false;
               continue;
            }

            res[i++]=k;
            res[i++]=-k;
            k++;
        }
        return res;
    }
}
