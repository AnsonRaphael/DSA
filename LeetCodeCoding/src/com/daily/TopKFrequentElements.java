package com.daily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums={3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
        int k=10;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));

    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> frq= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            frq.put(nums[i],(frq.getOrDefault(nums[i],0))+1);
        }
        Queue<int[]> queue = new PriorityQueue<>((o1,o2)->{
            return o1[1]-o2[1];
        });
        for (int q:frq.keySet() ) {
            queue.offer(new int[]{q,frq.get(q)});
            if(queue.size()>k){
                queue.poll();
            }
        }
        int[] res= new int[k];
        for (int i = 0; i < k; i++) {
            res[i]=queue.poll()[0];
        }
        return res;
    }
}
