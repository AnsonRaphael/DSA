package com.daily;

import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {

    public static void main(String[] args) {
        int[]stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2-o1);
        for (int i = 0; i < stones.length; i++) {
            queue.offer(stones[i]);
        }
        while (!queue.isEmpty()&&queue.size()>1){
            Integer x = queue.poll();
            Integer y = queue.poll();
            if(x>y){
                queue.offer(x-y);
            }
        }

        return queue.isEmpty()?0:queue.poll();
    }
}
