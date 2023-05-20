package com.sgmttree.wal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Chain {

    public static void main(String[] args) {
       int[] A={1,1,3,4,4,3,7,8,9,9,9};
       int n= A.length;
       System.out.println(MaxScore(A,n));
    }

    private static long MaxScore(int[] a, int n) {

    List<List<Integer>> ed= new ArrayList<>();
        for (int i = 0; i <= n; i++) {
           ed.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < a.length-1; i++) {
            ed.get(a[i]).add(i+2);
        }
        display(ed);
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");
        boolean[] visited = new boolean[n+1];
        for (int i = 0; i < n; i++) {
            if(!visited[i])
                clearEdge(ed,visited,i,n);
        }
        display(ed);
        boolean[] visited1 = new boolean[n+1];
        int res=0;
        for (int i = 0; i < n; i++) {
            if(!visited1[i]){
                int pathln=dfsPathLen(ed,visited1,i,n);
                res+=(pathln*pathln);
            }

        }

        return res;
    }

    public static int dfsPathLen(List<List<Integer>> ed,boolean[] visited ,int i,int n){
        if (i>n||ed.size()<=i)
            return 0;

        if(visited[i])
            return 0;
        visited[i]=true;
        List<Integer> edg = ed.get(i);
        if(edg.isEmpty())
            return 1;
        int maxPath=0;

        for (int j = 0; j < edg.size(); j++) {
            int path=1+clearEdge(ed,visited,edg.get(j),n);
            if(path>maxPath){
                maxPath=path;
            }
        }
        return maxPath;
    }

    public static int clearEdge(List<List<Integer>> ed,boolean[] visited ,int i,int n){
        if (i>n||ed.size()<=i)
            return 0;

        if(visited[i])
            return 0;
        visited[i]=true;
        List<Integer> edg = ed.get(i);
        if(edg.isEmpty())
            return 1;
        int maxPath=0;
        int indexMax=-1;
        for (int j = 0; j < edg.size(); j++) {
            int path=1+clearEdge(ed,visited,edg.get(j),n);
            if(path>maxPath){
                maxPath=path;
                indexMax=j;
            }
        }
        // remove all other
        int mk=edg.get(indexMax);
        ed.get(i).clear();
        ed.get(i).add(mk);

        return maxPath;
    }

    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().split(" ");
            int[] A = new int[N];
            for (int j = 0; j < arr.length; j++) {
                A[j] = Integer.parseInt(arr[j]);
            }
            Long out =MaxScore(A,N);
            System.out.println(out);
        }
        br.close();
    }


    static void display(List<List<Integer>> ed){

        boolean[] visited = new boolean[ed.size()+1];
        for (int i = 0; i < ed.size(); i++) {
            if(!visited[i]){
                List<Integer> edg = ed.get(i);
                System.out.print(i);
                for (int j = 0; j < edg.size(); j++) {
                   System.out.print("-->"+edg.get(j));
                }
                System.out.println();
            }
        }

    }

}
