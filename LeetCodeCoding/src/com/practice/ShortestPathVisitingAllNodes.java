package com.practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ShortestPathVisitingAllNodes {
    static class Node {
        int visited;
        int dist;
        int node;
        Node(int node, int dist, int visited) {
            this.node = node;
            this.dist = dist;
            this.visited = visited;
        }
    }
    public static void main(String[] args) {
        int[][] graph = {{1,2,3},{0},{0},{0}};
        int ln = shortestPathLength(graph);
        System.out.println(ln);
    }
    public static int shortestPathLength(int[][] graph) {
        int n = graph.length;
        Set<Integer>[] visited = new HashSet[n];
        Queue<Node> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            visited[i]= new HashSet<>();
            queue.add(new Node(i,0,1<<i));
            visited[i].add(1<<i);
        }

        //bfs
        while (!queue.isEmpty()){
            Node node = queue.poll();
            if(node.visited==(1<<n)-1)
                return node.dist;

            for (int i = 0; i < graph[node.node].length; i++) {
                // new visted value
                int ml= node.visited|(1<<graph[node.node][i]);
                if(visited[graph[node.node][i]].add(ml))
                    queue.add(new Node(graph[node.node][i],node.dist+1,ml));
            }
        }

        return -1;
    }

}
