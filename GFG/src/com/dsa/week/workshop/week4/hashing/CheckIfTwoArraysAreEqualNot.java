package com.dsa.week.workshop.week4.hashing;

import java.util.HashMap;

public class CheckIfTwoArraysAreEqualNot {
    public static void main(String[] args) {
        long A[]={1,2,5,4,0};
        long B[]={2,4,5,0,1};
        int N=5;
        System.out.println(check(A,B,N));
    }
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        HashMap<Long,Long> count= new HashMap<>();
        for (int i=0;i<N;i++){
            if(count.containsKey(A[i])){
                count.put(A[i],count.get(A[i])+1);
            }else {
                count.put(A[i],1L);
            }
        }
        for (int i=0;i<N;i++){
            if(count.containsKey(B[i])){
                count.put(B[i],count.get(B[i])-1);
            }else {
                return false;
            }
        }
        for(Long k:count.keySet()){
            if(count.get(k)<0){
                return false;
            }
        }
        return true;
    }
}
