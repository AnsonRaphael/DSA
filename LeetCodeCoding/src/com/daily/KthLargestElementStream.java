package com.daily;

import java.util.PriorityQueue;

public class KthLargestElementStream {

    static class KthLargest {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int k;
        public KthLargest(int k, int[] nums) {
              this.k=k;
            for (int a:nums) {
                queue.offer(a);
                if(queue.size()>k)
                    queue.poll();
            }
        }

        public int add(int val) {
            if(queue.size()<k){
                queue.add(val);
            }else if(queue.peek()<val) {
                queue.poll();
                queue.offer(val);
            }

            return queue.peek();
        }
    }
    public static void main(String[] args) {

    }

}
