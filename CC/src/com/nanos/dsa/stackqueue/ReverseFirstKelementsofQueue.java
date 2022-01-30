package com.nanos.dsa.stackqueue;

import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKelementsofQueue {
    class GfG {
        // Function to reverse first k elements of a queue.
        public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
            // add code here.
            Stack<Integer> rev=new Stack<>();
            if(q==null||q.size()==0)
                return q;
            int size=q.size();

            int balance=size-k;
            for(int i=0;i<k;i++){
                rev.push(q.poll());
            }
            for(int i=0;i<k;i++){
                q.offer(rev.pop());
            }
            for(int i=0;i<balance;i++){
                q.offer(q.poll());
            }
            return q;
        }
    }
}
