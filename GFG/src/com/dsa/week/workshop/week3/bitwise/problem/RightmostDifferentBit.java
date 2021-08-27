package com.dsa.week.workshop.week3.bitwise.problem;

public class RightmostDifferentBit {
    public static void main(String[] args) {
        int m=52;
        int n=4;
        System.out.println(posOfRightMostDiffBit(m,n));
    }
    public static int posOfRightMostDiffBit(int m, int n)
    {

        // Your code here
        int res= m^n,count=0;
        while(res>0){
            if((res&1)!=0){
                break;
            }
            res>>=1;
            count++;
        }
        if(res==0)
            return 0;
        return count+1;
    }
}
