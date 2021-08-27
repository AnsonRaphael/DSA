package com.dsa.week.workshop.week3.bitwise.problem;

public class BitDifference {
    public static void main(String[] args) {
        int a=25;
        int b=20;
        System.out.println(countBitsFlip(a,b));
    }
    public static int countBitsFlip(int a, int b){

        // Your code here
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(b));
        int res= a^b,count =0;
//        System.out.println(Integer.toBinaryString(res));
        while (res>0){
            if((res&1)!=0)
            count++;
            res=res>>1;
        }
        return count;
    }

}
