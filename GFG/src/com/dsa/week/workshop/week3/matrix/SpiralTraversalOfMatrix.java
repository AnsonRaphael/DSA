package com.dsa.week.workshop.week3.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversalOfMatrix {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(spiralOrder(a,a.length,a[0].length));
    }

    private static List<Integer> spiralOrder(int[][] a,int rn,int cn) {
        List<Integer> res=new ArrayList<>();
        int rs=0,re=rn-1,cs=0,ce=cn-1;
        while (rs<=re&&cs<=ce){

            for (int i=cs;i<=ce;i++){
                res.add(a[rs][i]);
            }
            rs++;
            for (int i=rs;i<=re;i++){
                res.add(a[i][ce]);
            }
            ce--;
            if(rs<=re){
                for (int i=ce;i>=cs;i--){
                    res.add(a[re][i]);
                }
                re--;
            }
            if(cs<=ce){
                for (int i=re;i>=rs;i--){
                    res.add(a[i][cs]);
                }
                cs++;
            }

        }
        return res;
    }

}
