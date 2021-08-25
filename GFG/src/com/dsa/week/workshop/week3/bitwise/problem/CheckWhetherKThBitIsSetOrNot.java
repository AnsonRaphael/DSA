package com.dsa.week.workshop.week3.bitwise.problem;

public class CheckWhetherKThBitIsSetOrNot {
    public static void main(String[] args) {
        int n=4;
        int k=2;
        System.out.println(checkKthBit(n,k));
    }
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        int m=1;
        for(int i=0;i<k;i++){

            m=m<<1;
        }

        if((m&n)!=0){
            return true;
        }else
            return false;
    }
}
