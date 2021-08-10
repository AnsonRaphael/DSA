package com.dsa.week.workshop.week3.matrix.problem;

import com.dsa.week.workshop.week3.matrix.Matrix2DArrayUtil;

import java.util.ArrayList;

public class SpirallyTraversingAMatrix {
    public static void main(String[] args) {
//        int matrix[][] = {{1, 2, 3, 4},
//            {5, 6, 7, 8},
//            {9, 10, 11, 12},
//            {13, 14, 15,16}};
        int [][] matrix={{6 ,6 ,2},{ 28 ,2 ,12},{ 26 ,3 ,28},{ 7, 22 ,25},{ 3 ,4 ,23}};
        Matrix2DArrayUtil.printMatrix(matrix, matrix.length, matrix[0].length);
        System.out.println(spirallyTraverse(matrix, matrix.length, matrix[0].length));
    }
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here
        ArrayList<Integer>res = new ArrayList<>();
        int rs=0,re=r-1,cs=0,ce=c-1;
        while (rs<=re&&cs<=ce){
            for (int i=cs;i<=ce;i++){
                res.add(matrix[rs][i]);
            }
            rs++;
            for (int i=rs;i<=re;i++){
                res.add(matrix[i][ce]);
            }
            ce--;
            if(rs<=re){
                for (int i=ce;i>=cs;i--){
                    res.add(matrix[re][i]);
                }
                re--;
            }
            if(cs<=ce){
                for (int i=re;i>=rs;i--){
                    res.add(matrix[i][cs]);
                }
                cs++;
            }

        }
        return res;
    }
}
