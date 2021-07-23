package com.dsa.week.workshop.week1.mathematics.problems;

public class PrimalityTest {
    public static void main(String[] args) {
        int N = 11;
        System.out.println(isPrime(N));
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
