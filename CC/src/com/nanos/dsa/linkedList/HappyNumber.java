package com.nanos.dsa.linkedList;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.print(isHappy(1));
    }

    public static boolean isHappy(int n) {
        int fast=compute(compute(n));
        int slow=compute(n);
        while (fast!=slow){
            System.out.println(slow);
            if(fast==slow){
                return false;
            }
            if(fast==1||slow==1)
                return true;
            fast=compute(compute(fast));
            slow=compute(slow);
        }
        if(fast==1||slow==1)
            return true;

        return false;
    }

    private static int compute(int n){
        int sum=0;
        while (n>0){
            int k=n%10;
            sum+=(k*k);
            n=n/10;
        }
        return sum;
    }
}
