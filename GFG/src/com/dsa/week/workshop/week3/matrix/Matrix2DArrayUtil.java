package com.dsa.week.workshop.week3.matrix;

public class Matrix2DArrayUtil {

    static void printMatrix(int arr[][],int r,int c){
        System.out.println("-------------------------------------------------------------");
        for (int i=0;i<r;i++){
            System.out.print("[ ");
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("]");
        }
        System.out.println("-------------------------------------------------------------");
    }
}
