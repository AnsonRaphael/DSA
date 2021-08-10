package com.dsa.week.workshop.week3.matrix.problem;

import com.dsa.week.workshop.week3.matrix.Matrix2DArrayUtil;

public class AddingTwoMatrices {
    public static void main(String[] args) {
      int  A[][] = {{1, 2, 3},
            {4, 5, 6}};
      int  B[][] = {{1, 3, 3},
            {2, 3, 3}};
        Matrix2DArrayUtil.printMatrix(sumMatrix(A,B),A.length,A[0].length);
    }
    static int[][] sumMatrix(int A[][], int B[][])
    {
        // code here
        int ar=A.length,ac=A[0].length;
        int br = B.length,bc=B[0].length;
        int [][]res=new int[ar][ac];
        if(ar==br&&ac==bc){

            for (int i=0;i<ar;i++){
                for (int j=0;j<ac;j++){
                    res[i][j]=A[i][j]+B[i][j];
                }
            }
        }else {
            res=new int[0][0];
        }
        return res;
    }
}
