package com.learn.algorithms.bubblesort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ShubhamXor {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        Long[] array = new Long[n];
        st = new StringTokenizer(br.readLine());
        HashMap<Long,Long> arrayFreq = new HashMap<>();
        for(int i=0;i<n;i++){
            Long arr=Long.parseLong(st.nextToken());
            array[i]=arr;
            if(arrayFreq.containsKey(arr)){
                Long p=arrayFreq.get(arr)+1;
                arrayFreq.put(arr,p);
            }
            else
                arrayFreq.put(arr, 1L);
        }
        BigInteger count = new BigInteger("0");

        for(Long key:arrayFreq.keySet()){
            long val=arrayFreq.get(key);
            if(val>1)
            count=count.add(getCombination(val));
        }
        System.out.println(count);
    }

    public static BigInteger getCombination(long m){
        BigInteger m1 = new BigInteger(String.valueOf(m));
        return m1.multiply(m1.subtract(new BigInteger("1"))).divide(new BigInteger("2"));
    }
}
