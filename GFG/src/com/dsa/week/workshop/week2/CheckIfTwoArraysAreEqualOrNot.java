package com.dsa.week.workshop.week2;

import java.util.HashMap;

public class CheckIfTwoArraysAreEqualOrNot {
    public static void main(String[] args) {
//       int arr1[] = {1, 2, 5, 4, 0};
//       int arr2[] = {2, 4, 5, 0, 1};
      int  arr1[] = {1, 7, 1};
      int  arr2[] = {7, 7, 1};
        HashMap<Integer,Integer> co=new HashMap<>();
       for (int i=0;i<arr1.length;i++){
           if(co.containsKey(arr1[i])){
               int con=co.get(arr1[i]);
               co.put(arr1[i],++con);
           }else {
               co.put(arr1[i],1);
           }

       }

       // check arr2
        for (int i=0;i<arr2.length;i++){
            if(co.containsKey(arr2[i])){
                int con=co.get(arr2[i]);
                if(con==0){
                    System.out.println("not same");
                    return;
                }else{
                    con--;
                    co.put(arr2[i],con);
                }
            }else{
                System.out.println("not same");
                return;
            }
        }
        System.out.println("same");

    }
}
