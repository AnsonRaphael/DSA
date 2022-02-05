package com.datastructureI;

public class ReshapetheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length,n=mat[0].length;
        if(n*m!=(r*c))
            return mat;
        int[][] res=new int[r][c];
        int rm=0,cm=0,k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                rm=k/n;
                cm=k%n;
                res[i][j]=mat[rm][cm];
                k++;
            }
        }
        return res;
    }
}
