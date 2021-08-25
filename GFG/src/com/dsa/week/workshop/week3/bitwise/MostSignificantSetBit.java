package com.dsa.week.workshop.week3.bitwise;

public class MostSignificantSetBit {
    public static void main(String[] args) {
        int n=18;
        System.out.println(findMSB(n));
    }
    static int findMSB(int n){
        int count=0;
        while (n!=0){
            count++;
            n=n>>1;
        }
        if(count!=0){
            count= (int) Math.pow(2,count-1);
        }
        return count;
    }
}
