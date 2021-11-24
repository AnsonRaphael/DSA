package com.nanos.dsa.sorting;

import java.util.Arrays;
import java.util.HashMap;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1={2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2={2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));

    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res=new int[arr1.length];
        HashMap<Integer,Integer> fr= new HashMap<>();
        for(int i=0;i<arr2.length;i++){
            fr.put(arr2[i],0);
        }
        for(int i=0;i<arr1.length;i++){
            if(fr.containsKey(arr1[i])){
                fr.put(arr1[i],fr.get(arr1[i])+1);
            }
        }
        int m=0;
        for(int i=0;i<arr2.length;i++){
            int c=fr.get(arr2[i]);
            for(int j=0;j<c;j++){
                res[m]=arr2[i];
                m++;
            }
        }
        int k=m;
        for(int i=0;i<arr1.length;i++){
            if(!fr.containsKey(arr1[i])){
                res[m]=arr1[i];
                m++;
            }
        }
        Arrays.sort(res,k,arr1.length);
        return res;
    }
}
