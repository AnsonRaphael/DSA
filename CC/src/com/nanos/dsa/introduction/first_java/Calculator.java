package com.nanos.dsa.introduction.first_java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a,b;
        String  c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.next();
        if(c.equalsIgnoreCase("+")){
            int d=a+b;
            System.out.println(a+" + "+b+" = "+d);
        }else if(c.equalsIgnoreCase("-")){
            int d=a-b;
            System.out.println(a+" - "+b+" = "+d);
        }else if(c.equalsIgnoreCase("/")){
            int d=a/b;
            System.out.println(a+" / "+b+" = "+d);
        }else if(c.equalsIgnoreCase("%")){
            int d=a%b;
            System.out.println(a+" % "+b+" = "+d);
        }else if(c.equalsIgnoreCase("*")){
            int d=a*b;
            System.out.println(a+" * "+b+" = "+d);
        }
    }
}
