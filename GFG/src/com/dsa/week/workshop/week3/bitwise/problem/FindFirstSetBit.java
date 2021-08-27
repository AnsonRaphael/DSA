package com.dsa.week.workshop.week3.bitwise.problem;

public class FindFirstSetBit {
    public static void main(String[] args) {
        int n=12;
        System.out.println(getFirstSetBit(n));
    }
    public static int getFirstSetBit(int n){

        // Your code here
        int count=0;
        if(n==0)
            return 0;
        while (n>0){
            if((n&1)!=0){
                break;
            }
            n=n>>1;
           count++;
        }
        return count+1;
    }
}
