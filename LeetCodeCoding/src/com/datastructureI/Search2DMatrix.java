package com.datastructureI;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int s=0,e=row*col-1,m=0;
        while(s<=e){
            m=s+(e-s)/2;
            int ro=m/col;
            int co=m%col;
            if(matrix[ro][co]==target)
                return true;
            if(matrix[ro][co]>target){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return false;
    }
}
