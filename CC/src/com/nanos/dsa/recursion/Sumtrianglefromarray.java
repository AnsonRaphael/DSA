package com.nanos.dsa.recursion;

public class Sumtrianglefromarray {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        printTriangle(A);
    }
    public static void printTriangle(int[] A){
        if(A.length<1){
            return;
        }
        int[] an = new int[A.length-1];
        for (int i = 0; i < A.length-1; i++) {
            an[i]=A[i]+A[i+1];
        }
        printTriangle(an);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }

}
