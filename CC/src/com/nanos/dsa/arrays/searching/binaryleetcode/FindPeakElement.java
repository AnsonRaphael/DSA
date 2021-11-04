package com.nanos.dsa.arrays.searching.binaryleetcode;

import java.util.Arrays;

public class FindPeakElement {
    public static void main(String[] args) {
        //int[][] mat={{1,4},{3,2}};
        //int [][] mat={{10,20,15},{21,30,14},{7,16,32}};
        //int[][] mat={{45,35,27,15,29},{38,18,1,49,11},{45,28,22,18,10},{14,49,7,6,25},{7,23,39,17,3}};
        int [][]mat={{10,50,40,30,20},{1,500,2,3,4}};
        for (int i=0;i<mat.length;i++){
            System.out.println(Arrays.toString(mat[i]));
        }

        System.out.println(Arrays.toString(findPeakGrid(mat)));
        //System.out.println(Arrays.toString(findPeakGrid1(mat)));
    }
    public static int[] findPeakGrid(int[][] mat) {
        int [] res= {-1,-1};
        int l=0,r=mat[0].length-1,m=0;
        while (l<=r){
            m=l+(r-l)/2;
            int maxrow=0;
            for (int i=0;i<mat.length;i++){
                maxrow=mat[i][m]>=mat[maxrow][m]?i:maxrow;
            }
            boolean lef=m-1>=0&&mat[maxrow][m-1]>mat[maxrow][m];
            boolean ref=m+1<=r&&mat[maxrow][m+1]>mat[maxrow][m];

            if(!lef&&!ref){
                return new int[]{maxrow, m};
            }else if(ref){
                l=m+1;
            }else {
                r=m-1;
            }
        }
        return res;
    }


}
