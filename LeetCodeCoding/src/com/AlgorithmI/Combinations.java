package com.AlgorithmI;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        int n=4;
        int k=2;
        System.out.println(combine(n,k));
    }
    public static List<List<Integer>> combine(int n, int k) {
        if(n==0||k==0)
            return null;
        List<List<Integer>> res = new ArrayList<>();
            //combineAll(new ArrayList<>(),n,k,res);
            combineAll1(new ArrayList<>(),1,n,k,res);
        return res;
    }
    public static void combineAll(List<Integer>cur,int n, int k,List<List<Integer>> res) {
        if(k==0)
            res.add(new ArrayList<>(cur));
        if(n==0)
            return;

            combineAll(cur,n-1,k,res);

            cur.add(n);
            combineAll(cur,n-1,k-1,res);

            cur.remove(cur.size()-1);


    }
    public static void combineAll1(List<Integer>cur,int start,int n, int k,List<List<Integer>> res) {
        if(k==cur.size())
            res.add(new ArrayList<>(cur));

        for (int i = start; i <=n || i<=k ; i++) {
            cur.add(i);
            combineAll1(cur,i+1,n,k,res);
            cur.remove(cur.size()-1);
        }
    }
}
