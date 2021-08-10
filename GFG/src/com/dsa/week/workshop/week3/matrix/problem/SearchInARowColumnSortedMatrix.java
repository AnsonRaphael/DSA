package com.dsa.week.workshop.week3.matrix.problem;

import com.dsa.week.workshop.week3.matrix.Matrix2DArrayUtil;

public class SearchInARowColumnSortedMatrix {
    public static void main(String[] args) {
        int n = 3, m = 3, x = 443;
        int matrix[][] = {{ 3, 30, 38},
            {36, 43, 60},
            {40, 51, 69}};
        Matrix2DArrayUtil.printMatrix(matrix,matrix.length,matrix[0].length);
        System.out.println(search(matrix,n,m,x));
    }
    static boolean search(int matrix[][], int n, int m, int x)
    {
        // code here
        boolean res=false;
        int rs=0,re=n-1,cs=0,ce=m-1;
        while (rs<=re&&cs<=ce){

            if(matrix[rs][ce]==x){
                res=true;
                break;
            }
            if(matrix[rs][ce]>x){
                ce--;
            }else if(matrix[rs][ce]<x){
                rs++;
            }
        }

        return res;
    }
}
