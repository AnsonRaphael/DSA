package com.dsa.week.workshop.week3.bitwise.problem;

public class CountTotalSetBits {
    public static void main(String[] args) {
        int n=4;

        System.out.println(countSetBits(n));
    }
    public static int countSetBits(int n){

        // Your code here
        int count =0;
        if (n <= 1)
            return n;
        int x=largestPower(n);
        count=  (x*(int)(Math.pow(2,x))/2)+(n-(int)(Math.pow(2,x))+1)+countSetBits((n-(int)(Math.pow(2,x))));
        return count;
    }
    public static int largestPower(int n){
        int count=0;
        while ((1<<count)<=n){
            count++;
        }
        return count-1;
    }
}
