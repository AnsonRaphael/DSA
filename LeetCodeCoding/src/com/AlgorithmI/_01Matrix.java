package com.AlgorithmI;

import java.util.LinkedList;
import java.util.Queue;

public class _01Matrix {
    public static void main(String[] args) {

    }
    public static int[][] updateMatrix(int[][] mat) {
        int n= mat.length;
        int m=mat[0].length;
        boolean[][] seen = new boolean[n][m];
        Queue<int[]> queue=new LinkedList<>();
        int[] dir = {0,1,0,-1,0};
        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                if(mat[i][j]==0){
                    queue.offer(new int[]{i,j});
                    seen[i][j]=true;
                }
            }
        }

        while (!queue.isEmpty()){
            int x =queue.peek()[0];
            int y =queue.poll()[1];
            for (int i = 0; i < 4; i++) {
                int xi=x+dir[i];
                int yi=y+dir[i+1];
                if(xi>=n||xi<0||yi>=m||yi<0)
                    continue;
                if(seen[xi][yi])
                    continue;
                mat[xi][yi]=1+mat[x][y];
                seen[xi][yi]=true;
                queue.offer(new int[]{xi,yi});
            }

        }
        return mat;
    }
}
