package com.nanos.dsa.recursion;

import java.util.Scanner;

public class GeekonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int n=sc.nextInt();
            System.out.println(geeknacki(a,b,c,n));
            t--;
        }
    }

    public static int geeknacki(int a,int b,int c,int n){
        if(n==1)
            return a;
        if(n==2)
            return b;
        if(n==3)
            return c;

        return geeknacki(a,b,c,n-1)+geeknacki(a,b,c,n-2)+geeknacki(a,b,c,n-3);
    }
}
