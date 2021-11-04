package com.nanos.dsa.arrays.searching.binaryleetcode;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
    }
    public static boolean isPerfectSquare(int num) {
        long l=1,r=num,m=1;
        while(l<=r){
            m=l+(r-l)/2;
            System.out.println(l+" "+r+" "+m+" "+(m*m)+" "+num);
            if((m*m)==num){

                return true;
            }
            if((m*m)>num){
                r=m-1;
            }else{
                l=m+1;
            }

        }
        return false;
    }
}
