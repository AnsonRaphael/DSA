package com.dsa.week.workshop.week1.mathematics.problems;

public class Exactly3Divisors {
    public static void main(String[] args) {
        int  N = 67;
        System.out.println(exactly3Divisors(N));
    }
    public static int exactly3Divisors(int N)
    {
        //Your code here
        int ans=0;
        for(int i=2;i*i<=N;i++){

            if(isPrime(i)){
                ans++;
            }

        }
        return ans;
    }
    public static boolean isPrime(int N) {
        // code here
        if(N<2)
            return false;
        if(N==2)
            return true;
        for (int i=2;i*i<=N;i++){
            if(N%i==0)
                return false;
        }
        return true;
    }
}
