package com.daily;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
    public static void main(String[] args) {

        int[][] grid={{1},{2},{3},{4},{7},{6},{5}};
       int k= 23;
       System.out.println(shiftGrid(grid,k));
    }

    public  static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length,m=grid[0].length;
        int h=(n*m)-k%(n*m);
        int[] arr = new int[n*m];
        int ni=(h)/m,mi=(h)%m,o=0;
        int ki=mi;
        for (int i = ni; i < n; i++) {
            for (int j = mi; j < m; j++) {
                arr[o]=grid[i][j];
                o++;
            }
            mi=0;
        }

        for (int i = 0; i <= ni && o<(m*n); i++) {
            int mn=m;
            if(i==ni)
                mn=ki;
            for (int j = 0; j < mn && o<(m*n); j++) {
                arr[o]=grid[i][j];
                o++;
            }

        }
        int ui=0;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> res1 = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                res1.add(arr[ui]);
                ui++;
            }
            res.add(res1);
        }
        return res;
    }
}
