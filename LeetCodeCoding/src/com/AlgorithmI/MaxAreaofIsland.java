package com.AlgorithmI;

public class MaxAreaofIsland {
    public static void main(String[] args) {
        int[][]grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(maxAreaOfIsland(grid));
    }
    public static int maxAreaOfIsland(int[][] grid) {
        int sum=0,max=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]==1){
                  sum=area(grid,i,j);
                  if (sum>max)
                      max=sum;
                }
            }
        }
        return max;
    }

    private static int area(int[][] grid, int i, int j) {
        if(!isSafe(grid,i,j)){
            return 0;
        }
        grid[i][j]=-1;
        int lef=area(grid,i-1,j);
        int rig=area(grid,i+1,j);
        int ver=area(grid,i,j-1);
        int hig=area(grid,i,j+1);
        return 1+lef+rig+ver+hig;
    }

    private static boolean isSafe(int[][]grid,int i,int j){
        if(j<0||i<0||i>=grid.length||j>=grid[0].length)
            return false;
        if(grid[i][j]==0||grid[i][j]==-1){
            return false;
        }
        return true;
    }
}
