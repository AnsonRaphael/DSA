package com.nanos.dsa.introduction.flow_of_program;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        multTable(a);
    }
    static void multTable(int a){

        for (int i=1;i<=10;i++){
            System.out.println(i+" x "+a+" = "+a*i);

        }
    }
}
