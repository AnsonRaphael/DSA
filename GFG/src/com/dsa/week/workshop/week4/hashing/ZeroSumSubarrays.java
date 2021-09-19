package com.dsa.week.workshop.week4.hashing;

import java.util.HashMap;

public class ZeroSumSubarrays {
    public static void main(String[] args) {
        long[] arr ={0,0,5,5,0,0};
        int n=6;
        System.out.println(findSubarray(arr,n));
    }
    public static long findSubarray(long[] arr ,int n)
    {
        //Your code here
        HashMap<Long,Long> pre = new HashMap<>();
        Long prsm=0L;
        long con=0;
        for (int i=0;i<n;i++){
            prsm+=arr[i];
            if(pre.containsKey(prsm)){
                con+=pre.get(prsm);
                pre.put(prsm,pre.get(prsm)+1);
            }else {
                pre.put(prsm,1L);
            }
            if(prsm==0)
                con++;

        }


        return con;
    }
}
