package com.daily;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinimizeDeviationinArray{

    public static void main(String[] args) {
        int[] nums = {3,5};
        System.out.println(minimumDeviation(nums));
    }
    public static int minimumDeviation(int[] nums) {
        //max value
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int min =Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2!=0)
                nums[i]=nums[i]*2;
            pq.add(nums[i]);
            min=Math.min(min,nums[i]);
        }

        int diff =Integer.MAX_VALUE;

        while (pq.peek()%2==0){
            int max=pq.remove();
            diff=Math.min(diff,max-min);
            max/=2;
            min =Math.min(max,min);
            pq.add(max);
        }


        return Math.min(diff,pq.peek()-min);
    }
}
