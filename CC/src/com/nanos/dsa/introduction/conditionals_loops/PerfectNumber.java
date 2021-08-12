package com.nanos.dsa.introduction.conditionals_loops;

public class PerfectNumber {
    public static void main(String[] args) {
        int n=6,sum=1;
        for (int i=2;i*i<n;i++){
            if(n%i==0){
                sum+=i+(n/i);
            }
        }

        if(sum==n){
            System.out.println("Perfect Number");
        }else {
            System.out.println("Not Perfect Number");
        }
    }
}
