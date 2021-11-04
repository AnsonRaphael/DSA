package com.nanos.dsa.arrays.searching.binaryleetcode;

public class Sqrt {
    public static void main(String[] args) {
        int x=2147395599;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        int res=1;
        long l=0,r=x,m=0;
        while(l<=r){
            m=l+(r-l)/2;

            if(m*m==x){
                res= (int) m;
                break;
            }
            if(m*m<x){
                res= (int) m;
                l=m+1;
            }else{
                r=m-1;
            }

        }
        return res;
    }
}
