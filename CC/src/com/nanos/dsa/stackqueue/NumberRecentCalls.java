package com.nanos.dsa.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class NumberRecentCalls {
    class RecentCounter {
        Queue <Integer>q;

        public RecentCounter() {
            q=new  LinkedList<Integer>();
        }

        public int ping(int t) {

        q.offer(t);
        int min=t-3000;
        while (min>q.peek()){
            q.poll();
        }
        return q.size();
        }
    }

    public static void main(String[] args) {

    }
}
