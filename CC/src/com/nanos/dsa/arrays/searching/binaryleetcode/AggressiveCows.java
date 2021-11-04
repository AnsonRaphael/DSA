package com.nanos.dsa.arrays.searching.binaryleetcode;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int c=sc.nextInt();
            int [] N=new int[n];
            for(int j=0;j<n;j++){
                N[j]=sc.nextInt();
            }
            System.out.println(largestMinDistance(n,c,N));
        }
    }

    private static int largestMinDistance(int n, int c,int[] N) {
        Arrays.sort(N);
        int l=0,r=1000000000,m=0,res=0;
        while (l<=r){
            m=l+(r-l)/2;
            //System.out.println(l+" "+r+" "+m);
            if(check(m,c,N)){
                res=m;
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return res;
    }

    private static boolean check(int m, int c, int[] n) {
        int cownm=1,pos=n[0];
        for (int i=1;i<n.length;i++){
            if(n[i]-pos>=m){
             cownm++;
             pos=n[i];
             if(cownm==c){
                 return true;
             }
            }
        }
        return false;
    }
}
