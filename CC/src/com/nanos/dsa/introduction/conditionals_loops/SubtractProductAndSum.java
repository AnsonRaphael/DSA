package com.nanos.dsa.introduction.conditionals_loops;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        int a=234;
        System.out.println(subtractProductAndSum(a));
    }
    static public int subtractProductAndSum(int n) {
        long sum=0,pd=1;
        while (n!=0){
            int a=n%10;
            n=n/10;
            sum+=a;
            pd*=a;
        }
        return (int) (pd-sum);
    }
}
