package com.daily;

public class DesignHashSet {
    class MyHashSet {
        boolean[] val ;
        public MyHashSet() {
            val=new boolean[1000001];
        }

        public void add(int key) {
            val[key]=true;
        }

        public void remove(int key) {
            val[key]=false;
        }

        public boolean contains(int key) {
            return val[key];
        }
    }

}
