package com.nanos.dsa.introduction.functions;

public class Palindrome {
    public static void main(String[] args) {
        int a=121;
        System.out.println(isPalindrome(a));
    }
    static boolean isPalindrome(int a){
        int d=a,n=0;
        while (d!=0){
            int c=d%10;
            d=d/10;
            n=n*10+c;
        }
        return n==a;
    }
}
