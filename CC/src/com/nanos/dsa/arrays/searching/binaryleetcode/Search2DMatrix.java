package com.nanos.dsa.arrays.searching.binaryleetcode;

public class Search2DMatrix {
    public static void main(String[] args) {

        //int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] matrix={{1,2}};
        int target=2;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int size=col*row;
        int l=0,r=size-1,m=0;
        while (l<=r){
            m=l+(r-l)/2;
            int tr=m/col;
            int tc=m-(tr*col);
            //System.out.println(tr+" "+tc+" "+m);
            if(matrix[tr][tc]==target){
                return true;
            }
            if(matrix[tr][tc]<target){
                l=m+1;
            }else {
                r=m-1;
            }
        }
        return false;
    }
}
