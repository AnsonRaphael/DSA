package com.dsa.week.workshop.week2;

import java.util.HashMap;

public class CheckWhetherArrayContainsDuplicatesOrNot {
    public static void main(String[] args) {
        int  k = 3;
        int arr[] = {1, 2, 3, 4, 1, 2, 3, 4};
        HashMap<Integer,Integer> ar= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(ar.containsKey(arr[i])){
                int a=ar.get(arr[i]);
                ar.put(arr[i],++a);
            }else {
                ar.put(arr[i],1);
            }
        }
        boolean result=false;
        if(ar.containsKey(k)){
         if(ar.get(k)>1){
             result=true;
         }
        }
    System.out.println(result);
    }
}
