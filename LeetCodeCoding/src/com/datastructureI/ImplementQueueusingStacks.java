package com.datastructureI;

import java.util.Stack;

public class ImplementQueueusingStacks {
    static class MyQueue {
        Stack<Integer> org;


        public MyQueue() {
            org=new Stack<Integer>();
        }

        public void push(int x) {
            Stack<Integer> rev= new Stack<Integer>();
            while (!org.isEmpty())
                rev.push(org.pop());
            org.push(x);
            while (!rev.isEmpty())
                org.push(rev.pop());
        }

        public int pop() {
           return org.pop();
        }

        public int peek() {
           return org.peek();
        }

        public boolean empty() {
            return org.isEmpty();
        }
    }

}
