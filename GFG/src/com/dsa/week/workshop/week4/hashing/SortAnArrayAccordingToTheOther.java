package com.dsa.week.workshop.week4.hashing;

import java.util.Arrays;
import java.util.HashMap;

public class SortAnArrayAccordingToTheOther {
    public static void main(String[] args) {
        int A1[]={2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int N=11;
        int A2[]= {2, 1, 8, 3};
        int M=4;
        System.out.println(Arrays.toString(sortA1ByA2(A1,N,A2,M)));

    }
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        //Your code here
        HashMap<Integer,Integer> frq=new HashMap<>();

        int[] arr= new int[N];
        for (int i=0;i<M;i++){
            frq.put(A2[i],0);
        }
        for (int i=0;i<N;i++){
            if(frq.containsKey(A1[i])){
                frq.put(A1[i],frq.get(A1[i])+1);
            }else {
               arr[i]=A1[i];
            }
        }
        Arrays.sort(arr);
        for (int i=0,m=0;i<M;i++){
            int k=frq.get(A2[i]);
            while (k!=0){
                arr[m]=A2[i];
                k--;
                m++;
            }
        }
        return arr;
    }
}
