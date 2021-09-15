package com.dsa.week.workshop.week4.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElementsInEveryWindow {
    public static void main(String[] args) {
        int A[]={1,2,1,3,4,2,3};
        int n=7;
        int k=4;
        System.out.println(countDistinct(A,n,k));
    }
    static ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here
        ArrayList<Integer> res= new ArrayList<>();
        HashMap<Integer,Integer> frq= new HashMap<>();
        for (int i=0;i<k;i++){
            if(frq.containsKey(A[i])){
                frq.put(A[i],frq.get(A[i])+1);
            }else {
                frq.put(A[i],1);
            }
        }
        res.add(frq.size());
        for (int i=k;i<n;i++){
            int prev= A[i-k];
            // remove first elmnt
            int val=frq.get(prev);
            val--;
            if(val==0)
                frq.remove(prev);
            else
                frq.put(prev,val);
            // add right elm
            if(frq.containsKey(A[i])){
                frq.put(A[i],frq.get(A[i])+1);
            }else {
                frq.put(A[i],1);
            }
            res.add(frq.size());
        }
        return res;
    }
}
