package com.nanos.dsa.arrays;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix={{0,1}};
        setZeroes(matrix);
        for (int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public static void setZeroes(int[][] matrix) {
        boolean rowzero=false,columnzero=false;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0)
                columnzero=true;
        }
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[0][j]==0)
                rowzero=true;
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(columnzero){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }
        if(rowzero){
            for(int i=0;i<matrix[0].length;i++){
                matrix[0][i]=0;
            }
        }

    }
}
