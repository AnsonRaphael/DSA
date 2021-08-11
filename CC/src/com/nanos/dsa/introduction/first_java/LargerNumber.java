package com.nanos.dsa.introduction.first_java;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }

}
