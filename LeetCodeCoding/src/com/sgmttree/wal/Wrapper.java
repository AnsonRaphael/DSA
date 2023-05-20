package com.sgmttree.wal;

public class Wrapper {

    public static void cmp(Integer n){
        System.out.println(n+"int");
    }
    public static void cmp(String n){
        System.out.println(n+"str");
    }
    public static void main(String[] args) {
        Integer i= new Integer(-10);
        Integer j= new Integer(-10);
        Integer k= -10;
       // cmp(null);
        System.out.println(i==j);
        System.out.println(i.equals(j));
        System.out.println(i==k);
        System.out.println(i.equals(k));
    }
}
