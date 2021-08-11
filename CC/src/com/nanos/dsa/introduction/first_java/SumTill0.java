package com.nanos.dsa.introduction.first_java;

import java.util.Scanner;

public class SumTill0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum=0;
        boolean flag=true;
        while (flag){
            int a=sc.nextInt();
            sum+=a;
            if(a==0){
                break;
            }
        }
        System.out.println(sum);
    }
}
