package com.cc.arrays;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        //int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix={{1,2,3},{4,5,6}};
        for(int i=0;i<matrix.length;i++)
            System.out.println(Arrays.toString(matrix[i]));
        matrix=transpose(matrix);
        for(int i=0;i<matrix.length;i++)
        System.out.println(Arrays.toString(matrix[i]));
    }
    // square matrix
    public static int[][] transpose1(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[i].length;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        return matrix;
    }
    public static int[][] transpose(int[][] matrix) {
        int [][] trn=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                trn[j][i]=matrix[i][j];
            }
        }
        return trn;
    }
}
