package com.AlgorithmI;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {

    public static void main(String[] args) {
        int[][] grid={{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));
    }
    public static int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int [] diss={0,1,0,-1,0};
        boolean[][] seen= new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j]==2){
                    seen[i][j]=true;
                    queue.offer(new int[]{i,j});
                }
            }
        }
        int min=0;
        //display(grid);
        while (!queue.isEmpty()){
            int sz=queue.size();
            boolean flag=false;

            for (int i = 0; i < sz; i++) {
                int x=queue.peek()[0];
                int y=queue.poll()[1];
                for (int j = 0; j < 4; j++) {
                    int xi=x+diss[j];
                    int yi=y+diss[j+1];
                    if(xi>=n||xi<0||yi>=m||yi<0)
                        continue;
                    if(seen[xi][yi])
                        continue;
                    seen[xi][yi]=true;
                    if(grid[xi][yi]==0)
                        continue;
                    grid[xi][yi]=2;
                    //display(grid);
                    queue.offer(new int[]{xi,yi});
                    flag=true;
                }
            }
            if(flag)
                min++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j]==1)
                    return -1;

            }
        }
        return min;
    }
    public static void display(int[][] di){
        System.out.println("-----------------------------------");
        for (int i = 0; i < di.length; i++) {
            System.out.println(Arrays.toString(di[i]));
        }
        System.out.println("-----------------------------------");
    }
}
