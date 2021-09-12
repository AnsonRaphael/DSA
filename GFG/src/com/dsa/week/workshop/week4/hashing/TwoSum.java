package com.dsa.week.workshop.week4.hashing;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] A={1,4,45,6,10,8};
        int N=6;
        int X=16;
        System.out.println(keypair(A,N,X));
    }
    public static boolean keypair(int[] A, int N, int X)
    {
        // code here
        HashMap<Integer,Integer> con= new HashMap<>();
        for (int i=0;i<N;i++){
            int df=X-A[i];
            if(con.containsKey(df)){
                return true;
            }
            con.put(A[i],i);
        }
        return false;
    }
}
