package com.cc.arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat={{7,3,1,9},{3,4,6,9},{6,9,6,6},{9,5,8,5}};
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            int k=mat.length-1-i;
            if(i!=k){
                sum+=mat[i][i];
                sum+=mat[i][k];
            }else{
                sum+=mat[i][i];
            }
        }
        return sum;
    }
}
