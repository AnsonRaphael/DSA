package com.dsa.week.workshop.week1.mathematics.problems;

public class SmallestDivisibleNumber {

    public static void main(String[] args) {
        int a=6;
        System.out.println(getSmallestDivNum(a));
    }
    public static long getSmallestDivNum(int n){
        // code here
        long ans=1;
        for(int i=2;i<=n;i++){
            ans=lcm(ans,i);
        }
        return ans;
    }
    private static long gcd(long a,long b){
        if(b==0)
            return a;
        return (gcd(b,a%b));
    }
    private static long lcm(long a,long b){
        return (a*b)/gcd(a,b);
    }

}
