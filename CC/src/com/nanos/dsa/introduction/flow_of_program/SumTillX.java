package com.nanos.dsa.introduction.flow_of_program;

import java.util.Scanner;

public class SumTillX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum=0;
        while (sc.hasNextInt()){
            int a=sc.nextInt();
            sum+=a;
        }
        System.out.println(sum);
    }
}
