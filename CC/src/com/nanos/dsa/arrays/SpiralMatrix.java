package com.nanos.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        //int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix={{2,5},{8,4},{0,-1}};
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res= new ArrayList<>();
        int strw=0,enrw=matrix.length-1;
        int stcl=0,encl=matrix[0].length-1;
        while (strw<=enrw&&stcl<=encl){

            for (int i=stcl;i<=encl;i++){
                res.add(matrix[strw][i]);
            }
            strw++;
            for (int i=strw;i<=enrw;i++){
                res.add(matrix[i][encl]);
            }
            encl--;
            if(strw<=enrw&&stcl<=encl){
                for (int i=encl;i>=stcl;i--){
                    res.add(matrix[enrw][i]);
                }
                enrw--;
                for (int i=enrw;i>=strw;i--){
                    res.add(matrix[i][stcl]);
                }
                stcl++;
            }
        }
        return res;
    }
}
