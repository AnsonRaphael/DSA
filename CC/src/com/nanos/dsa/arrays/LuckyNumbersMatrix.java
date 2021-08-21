package com.nanos.dsa.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LuckyNumbersMatrix {
    public static void main(String[] args) {
        int[][] matrix={{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
       List<Integer> res= new ArrayList<>();
        HashSet<Integer> rowminset=new HashSet<>();
        int rowminval=0;
        int[] colmax=new int[matrix[0].length];
        for (int i=0;i<matrix.length;i++){
            rowminval=matrix[i][0];
            for (int j=1;j<matrix[0].length;j++){
                if(rowminval>=matrix[i][j]){
                    rowminval=matrix[i][j];
                }
            }
            rowminset.add(rowminval);
        }
        for (int i=0;i<matrix[0].length;i++){
            colmax[i]=matrix[0][i];
            for (int j=1;j<matrix.length;j++){
                if(colmax[i]<=matrix[j][i]){
                    colmax[i]=matrix[j][i];
                }
            }
        }
        for (int i=0;i<colmax.length;i++){
            if(rowminset.contains(colmax[i])){
                res.add(colmax[i]);
            }
        }

        return res;
    }
}
