package com.nanos.dsa.introduction.conditionals_loops;

import java.util.Scanner;

public class AverageN {
    public static void main(String[] args) {
        int n=3;
        float sum=0;
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<n;i++){
            sum+=sc.nextInt();
        }
        System.out.println(sum/n);
    }
}
