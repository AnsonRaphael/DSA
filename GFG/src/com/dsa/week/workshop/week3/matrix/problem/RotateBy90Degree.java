package com.dsa.week.workshop.week3.matrix.problem;

import com.dsa.week.workshop.week3.matrix.Matrix2DArrayUtil;

public class RotateBy90Degree {
    public static void main(String[] args) {
        int n = 3;
        int matrix[][] = {{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
        Matrix2DArrayUtil.printMatrix(matrix,n,n);
        rotateby90(matrix,n);
        Matrix2DArrayUtil.printMatrix(matrix,n,n);
    }

    static void rotateby90(int matrix[][], int n)
    {
        // code here
        for (int i=0;i<n/2;i++){
            for (int j=i;j<n-i-1;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][n-1-i];
                matrix[j][n-1-i]=matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j]=matrix[n-1-j][i];
                matrix[n-1-j][i]=t;

            }
        }
    }
}
