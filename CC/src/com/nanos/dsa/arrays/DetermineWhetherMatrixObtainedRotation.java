package com.nanos.dsa.arrays;

import java.util.Arrays;

public class DetermineWhetherMatrixObtainedRotation {
    public static void main(String[] args) {
//        int[][] mat={{0,1},{1,0}};
//        int[][] target={{1,0},{0,1}};
        int[][] mat={{0,0,0},{0,1,0},{1,1,1}};
        int[][] target={{1,1,1},{0,1,0},{0,0,0}};
        for (int i=0;i<mat.length;i++)
            System.out.println(Arrays.toString(mat[i]));
        System.out.println(findRotation(mat,target));



    }
    public static boolean findRotation(int[][] mat, int[][] target) {

        if(arraysEqual(mat,target))
            return true;
        rotate90(mat);

        if(arraysEqual(mat,target))
            return true;
        rotate90(mat);

        if(arraysEqual(mat,target))
            return true;
        rotate90(mat);

        if(arraysEqual(mat,target))
            return true;
        return false;
    }
    public static boolean arraysEqual(int[][] mat, int[][] target){
        boolean res=true;
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                if(mat[i][j]!=target[i][j]){
                    res=false;
                    break;
                }
            }
        }
        return res;
    }
    public static void rotate90(int [][] mat){

        for (int i=0;i<mat.length/2;i++){
            int n=mat[i].length;
            for (int j=i;j<n-i-1;j++){
                int t=mat[i][j];
                mat[i][j]=mat[n-1-j][i];
                mat[n-1-j][i]=mat[n-1-i][n-1-j];
                mat[n-1-i][n-1-j]=mat[j][n-1-i];
                mat[j][n-1-i]=t;
            }
        }
    }
}
