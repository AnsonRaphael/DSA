package com.nanos.dsa.stackqueue;

import java.util.*;

public class TaskScheduler {
    public static void main(String[] args) {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        System.out.print(leastInterval(tasks, n));
    }

    public static class Node implements Comparable<Node> {
        Character val;
        Integer frq;

        public Node(Character val, Integer frq) {
            this.val = val;
            this.frq = frq;
        }

        public Character getVal() {
            return val;
        }

        public void setVal(Character val) {
            this.val = val;
        }

        public Integer getFrq() {
            return frq;
        }

        public void setFrq(Integer frq) {
            this.frq = frq;
        }

        @Override
        public int compareTo(Node o) {
            return this.frq - o.frq;
        }
    }

    public static int leastInterval(char[] tasks, int n) {
        PriorityQueue<Node> qu = new PriorityQueue<>();
        HashMap<Character, Integer> frqMp = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            frqMp.put(tasks[i], frqMp.getOrDefault(tasks[i], 0) + 1);
        }
        for (Character l : frqMp.keySet()) {
            Node ml = new Node(l, frqMp.get(l));
            qu.add(ml);
        }
        int count = 0;
        Queue<HashMap<Node, Integer>> rem = new LinkedList<>();
        while (!qu.isEmpty()) {
            Node m = qu.poll();
            Character s = m.val;
            Integer fr = m.frq;
            if (fr > 1) {
                m.setFrq(fr - 1);
                m.setVal(s);
                HashMap<Node, Integer> tmp = new HashMap<Node, Integer>();
                tmp.put(m, count + n);
                rem.add(tmp);
            }
            if (qu.isEmpty()) {
                while (rem.peek()!=null&&(Integer) rem.peek().values().toArray()[0] != count) {
                    count++;
                }
            }
            if (rem.peek()!=null&&(Integer)rem.peek().values().toArray()[0] <= count)
                qu.add((Node)rem.poll().keySet().toArray()[0]);
            count++;
        }

        return count;
    }
    public static int leastInterval1(char[] tasks, int n) {
        PriorityQueue<Node> q = new PriorityQueue<>();
        HashMap<Character, Integer> frqMp = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            frqMp.put(tasks[i], frqMp.getOrDefault(tasks[i], 0) + 1);
        }
        for (Character l : frqMp.keySet()) {
            Node ml = new Node(l, frqMp.get(l));
            q.add(ml);
        }
        int count = 0;

        while (!q.isEmpty()) {
            List<Node> add = new LinkedList<Node>();
            for (int i = 0; i < n + 1; i ++) {
                if (q.isEmpty() && add.isEmpty()) {
                    break;
                }
                if (!q.isEmpty()) {
                    Node node = q.poll();
                    node.frq --;
                    if (node.frq != 0) {
                        add.add(node);
                    }
                }
                count ++;
            }
            for (Node node:add) {
                q.add(node);
            }
        }

        return count;
    }
}
