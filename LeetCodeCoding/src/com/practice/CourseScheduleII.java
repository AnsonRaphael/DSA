package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class CourseScheduleII {
    public static class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void main(String[] args) {
        int numCourses = 3;
        //int[][]prerequisites = {{1,0},{2,1}};
        //int[][]prerequisites = {{1,0}};
        int[][] prerequisites={{1,0},{1,2},{0,1}};
        System.out.println(Arrays.toString(findOrder(numCourses,prerequisites)));
    }
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        // adjecency list
        ArrayList<Edge>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < prerequisites.length; i++) {
            graph[prerequisites[i][0]].add(new Edge(prerequisites[i][0],prerequisites[i][1]));
        }
        // visited flag
        int[] visited = new int[numCourses];

        // to store topological sorted order
        Stack<Integer> order = new Stack<>();
        for (int i = 0; i < prerequisites.length; i++) {
            if(visited[prerequisites[i][0]]==0){
                if(topologicalSort(graph,visited,prerequisites[i][0],order)==false)
                    return new int[1];
            }
        }
        for (int i = 0; i < numCourses; i++) {
            if(visited[i]==0){
                if(topologicalSort(graph,visited,i,order)==false)
                    return new int[1];
            }
        }


        int[] res = new int[order.size()];
        for (int i = order.size()-1; i >=0; i--) {
            res[i]=order.pop();
        }
        return res;
    }
    public static boolean topologicalSort(ArrayList<Edge>[] graph,int[] visited,int src,Stack<Integer> order){
        if(visited[src]==2)
            return false;

        visited[src]=2;
        ArrayList<Edge> edges = graph[src];
        for (int i = 0; i < edges.size(); i++) {
            if(visited[edges.get(i).dest]!=1){
                boolean res=topologicalSort(graph,visited,edges.get(i).dest,order);
                if(!res)
                    return false;
            }
        }
        visited[src]=1;
        order.push(src);
        return true;
    }
}
