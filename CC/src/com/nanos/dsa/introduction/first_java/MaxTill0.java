package com.nanos.dsa.introduction.first_java;

import java.util.Scanner;

public class MaxTill0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long max=Long.MIN_VALUE;
        boolean flag=true;
        while (flag){
            int a=sc.nextInt();
            if(max<a)
                max=a;
            if(a==0){
                break;
            }
        }
        System.out.println(max);
    }
}
