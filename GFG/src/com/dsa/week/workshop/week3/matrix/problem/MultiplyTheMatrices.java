package com.dsa.week.workshop.week3.matrix.problem;

import com.dsa.week.workshop.week3.matrix.Matrix2DArrayUtil;

public class MultiplyTheMatrices {
    public static void main(String[] args) {
        int A[][] = {{4, 8},
            {0, 2},
            {1, 6}};
        int B[][] = {{5, 2},
            {9, 4}};
        Matrix2DArrayUtil.printMatrix(multiplyMatrix(A,B),A.length,B[0].length);
    }
    static int[][] multiplyMatrix(int A[][], int B[][])
    {
        // code here
        int ar=A.length,ac=A[0].length;
        int br = B.length,bc=B[0].length;
        int [][] res= new int[ar][bc];
        if(ac==br){
            for (int i=0;i<ar;i++){
                for (int j=0;j<bc;j++){
                    for (int k=0;k<ac;k++){
                        res[i][j]+=A[i][k]*B[k][j];
                    }
                }
            }
        }else {
            res=new int[0][0];
        }
        return res;
    }

}
