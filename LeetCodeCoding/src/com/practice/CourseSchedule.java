package com.practice;

import java.util.ArrayList;

public class CourseSchedule {
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
        int[][]prerequisites = {{1,0},{2,1}};
        System.out.println(canFinish(numCourses,prerequisites));
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        // create adjecency list
        ArrayList<Edge>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i]= new ArrayList<>();
        }
        for (int i = 0; i < prerequisites.length; i++) {
            graph[prerequisites[i][0]].add(new Edge(prerequisites[i][0],prerequisites[i][1]));
        }

        // now we need to start with any vertice and pass to a rescursion with visited for dependecy with it connections
        // visisted array
        int[] visited= new int[numCourses];
        //Stack<Integer> order= new Stack<>();
        for (int i = 0; i < numCourses; i++) {
            if(visited[i]==0){
                if(!orderCourse(graph,visited,i))
                    return false;
            }
        }


        return true;
    }

    public static boolean orderCourse(ArrayList<Edge>[] graph,int[] visited,int src){
        if(visited[src]==2)
            return false;
        visited[src]=2;
        boolean res=true;
        ArrayList<Edge> edges = graph[src];
        for (int i = 0; i < edges.size(); i++) {
            Edge edge = edges.get(i);
            if(visited[edge.dest]!=1)
                res= res&&orderCourse(graph,visited,edge.dest);
        }
        visited[src]=1;
        return res;
    }
}
