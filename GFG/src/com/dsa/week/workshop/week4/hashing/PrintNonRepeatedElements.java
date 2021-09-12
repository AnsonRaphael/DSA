package com.dsa.week.workshop.week4.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class PrintNonRepeatedElements {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,5,6,7};
        int n=10;
        System.out.println(printNonRepeated(arr,n));

    }
    static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
        // add your code here
        HashMap<Integer,Integer> frq=new HashMap<>();
        ArrayList<Integer> res= new ArrayList<>();
        for (int i=0;i<n;i++){
            if(frq.containsKey(arr[i])){
                frq.put(arr[i],frq.get(arr[i])+1);
            }else {
                frq.put(arr[i],1);
            }
        }
        for (int i=0;i<n;i++){
            if(frq.get(arr[i])==1)
                res.add(arr[i]);
        }
        return res;
    }
}
