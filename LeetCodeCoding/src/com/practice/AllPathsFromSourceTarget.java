package com.practice;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceTarget {
    public static void main(String[] args) {
        int[][] graph = {{1,2},{3},{3},{}};
        System.out.println(allPathsSourceTarget(graph));
    }
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        allPathsSourceTarget(res,path,graph,0);
        return res;
    }

    public static void allPathsSourceTarget(List<List<Integer>> res,List<Integer> path,int[][] graph,int x){
        if(x==graph.length-1){
            path.add(x);
            res.add(new ArrayList<>(path));
            path.remove(path.size()-1);
            return;
        }

        for (int i = 0; i < graph[x].length; i++) {
            if(graph[x][i]>0){
                int val= graph[x][i];
                graph[x][i] = -graph[x][i];
                path.add(x);
                allPathsSourceTarget(res,path,graph,val);
                path.remove(path.size()-1);
                graph[x][i]=-graph[x][i];
            }
        }
        
    }
}
