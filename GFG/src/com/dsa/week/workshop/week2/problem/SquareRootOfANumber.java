package com.dsa.week.workshop.week2.problem;

public class SquareRootOfANumber {
    public static void main(String[] args) {
        long x=5;

        System.out.println( floorSqrt1(x));
    }
    // time - O(sqrt(N)),space -O(i)
    static  long floorSqrt(long x){
        // Your code here
        int i=1;
        if(x==1)
            return 1;
        for (i=1;i*i<=x;i++){
        }
        x=i-1;
        return x;
    }

    static  long floorSqrt1(long x){
        // Your code here

        if(x==1)
            return x;
        long l=1,r=x,mid=0,ans=0;
        while(l<=r){
            mid=(l+r)/2;

            //perfect square
            if(mid*mid==x){
                ans=mid;
                break;

            }
            if(mid*mid<x){
                l=mid+1;
                ans=mid;
            }
            if(mid*mid>x){
                r=mid-1;
            }
        }
        return ans;
    }
}
