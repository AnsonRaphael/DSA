package com.practice;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class ShortestPathinaGridwithObstaclesElimination {
    public static class Pair implements Comparable<Pair>{
        int i;
        int j;
        int k;
        int dist;

        public Pair(int i,int j,int k,int dist){
            this.i=i;
            this.j=j;
            this.k=k;
            this.dist=dist;
        }


        @Override
        public int compareTo(Pair o) {
            return this.dist-o.dist;
        }
    }


    public static void main(String[] args) {
        int[][]grid = {{0,0,0},{1,1,0},{0,0,0},{0,1,1},{0,0,0}};
        int k = 1;
        System.out.println(shortestPath(grid,k));
    }

    public static int shortestPath(int[][] grid, int k) {
        int[] diff = {0,1,0,-1,0};
        Queue<Pair> queue = new PriorityQueue<>();
        boolean[][][] visted = new boolean[grid.length][grid[0].length][k+1];
        queue.offer(new Pair(0,0,k,0));
        while (!queue.isEmpty()){
            Pair lm = queue.poll();
            if(lm.i==grid.length-1&&lm.j==grid[0].length-1)
                return lm.dist;
            if(visted[lm.i][lm.j][lm.k]==true)
                continue;
            visted[lm.i][lm.j][lm.k]=true;
            for (int i = 0; i < diff.length-1; i++) {
                int x=lm.i+diff[i];
                int y=lm.j+diff[i+1];

                if(isValid(grid,x,y)){
                    if(grid[x][y]==1){
                        if(lm.k>0)
                        if(!visted[x][y][lm.k-1]){
                            queue.add(new Pair(x,y,lm.k-1,lm.dist+1));
                        }
                    }else {
                        if(!visted[x][y][lm.k]){
                            queue.add(new Pair(x,y,lm.k,lm.dist+1));
                        }
                    }
                }


            }
        }
        return -1;

    }

    private static int shortestPath1(int[][] grid, int k, int x, int y,HashMap<String,Integer> map,boolean[][] visted) {
        if(grid.length-1==x&&grid[0].length-1==y)
            return 0;

        int[] diff = {0,1,0,-1,0};
        int path=Integer.MAX_VALUE;
        String key=x+" "+y+" "+k;
        if(map.containsKey(key))
            return map.get(key);
        if(visted[x][y]==true)return Integer.MAX_VALUE;
        visted[x][y]=true;
        for (int i = 0; i < diff.length-1; i++) {
            int x1=x+diff[i];
            int y1=y+diff[i+1];
            if(isValid(grid,x1,y1)){
                if(grid[x1][y1]==1){
                    //grid[x1][y1]=-1;
                    int kl=shortestPath1(grid,k-1,x1,y1,map,visted);
                    if(kl!=Integer.MAX_VALUE)
                    path=Math.min(path,1+kl);
                    //grid[x1][y1]=1;
                }
                if(grid[x1][y1]==0){
                    //grid[x1][y1]=-1;
                    int kl=shortestPath1(grid,k,x1,y1,map,visted);
                    if(kl!=Integer.MAX_VALUE)
                        path=Math.min(path,1+kl);

                    //grid[x1][y1]=0;
                }
            }
        }
        map.put(key,path);
        visted[x][y]=false;
        return path;
    }
    public static boolean isValid(int[][] grid,int x,int y){
        if(x<0||x>=grid.length||y<0||y>=grid[0].length)
            return false;
        return true;
    }
//https://leetcode.com/problems/shortest-path-in-a-grid-with-obstacles-elimination/
}
