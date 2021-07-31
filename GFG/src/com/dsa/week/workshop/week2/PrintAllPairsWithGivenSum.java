package com.dsa.week.workshop.week2;

import java.util.HashMap;

public class PrintAllPairsWithGivenSum {
    public static void main(String[] args) {
      int  arr[] = {1, 5, 7, -1, 5};
       int sum = 6;
        HashMap<Integer,Integer> co=new HashMap<>();
       for (int i=0;i<arr.length;i++){
           int rem=sum-arr[i];
           if(co.containsKey(rem)){
               for(int j = 0; j < co.get(rem); j++)
               System.out.println(rem+" "+arr[i]);
           }
           if (co.containsKey(arr[i]))
           {
               co.put(arr[i], co.get(arr[i]) + 1);
           }
           else
           {
               co.put(arr[i], 1);
           }

       }
    }
}
