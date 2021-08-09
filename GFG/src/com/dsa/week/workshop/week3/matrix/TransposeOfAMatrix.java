package com.dsa.week.workshop.week3.matrix;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int A[][] = { {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3}};
        Matrix2DArrayUtil.printMatrix(A,A.length,A[0].length);
        Matrix2DArrayUtil.printMatrix(transposeMatrix(A),A[0].length,A.length);
    }
    static int[][] transposeMatrix(int[][] arr){
         int [][]brr=new int[arr[0].length][arr.length];
         for (int i=0;i< arr.length;i++){
             for (int j=0;j<arr[0].length;j++){
                 brr[j][i]=arr[i][j];
             }
         }
        return brr;
    }
}
