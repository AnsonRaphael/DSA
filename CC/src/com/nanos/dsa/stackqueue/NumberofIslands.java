package com.nanos.dsa.stackqueue;

public class NumberofIslands {
    public static void main(String[] args) {
        char[][] grid =
                {{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        boolean[][] visited=new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
             if(grid[i][j]=='1'&&isSafe(grid,i,j,visited)){
                 DFS(grid,i,j,visited);
                 count++;
             }
            }
        }
        return count;

    }

    public static boolean isSafe(char[][] grid,int r,int c,boolean[][] visited){
        int n=grid.length;
        int m=grid[0].length;
        if(!(r>=0&&r<n))
            return false;
        if(!(c>=0&&c<m))
            return false;
        return !visited[r][c];
    }
    public static void DFS(char[][] grid,int r,int c,boolean[][] visited){
        if(grid[r][c]=='0')
            return;
        int[] difx={-1,1,0,0};
        int[] dify={0,0,-1,1};
        visited[r][c]=true;
        for (int i = 0; i < difx.length; i++) {
            if( isSafe(grid,r+difx[i],c+dify[i],visited))
                DFS(grid,r+difx[i],c+dify[i],visited);
        }
    }

}
