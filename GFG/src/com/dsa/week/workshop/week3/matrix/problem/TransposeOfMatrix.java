package com.dsa.week.workshop.week3.matrix.problem;

import com.dsa.week.workshop.week3.matrix.Matrix2DArrayUtil;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int N = 4;
        int mat[][] = {{1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}};
        transpose(mat,N);
        Matrix2DArrayUtil.printMatrix(mat,N,N);
    }

    static void transpose(int matrix[][], int n)
    {
        // code here
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
    }

}
