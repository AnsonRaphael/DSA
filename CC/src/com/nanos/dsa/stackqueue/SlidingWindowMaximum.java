package com.nanos.dsa.stackqueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
       int[] nums = {1,3,-1,-3,5,3,6,7}; int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums,k)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] res= new int[nums.length-k+1];
        Deque<Integer> dq= new ArrayDeque<>();
        int i=0,j=0;
        for (i = 0; i < k; i++) {
            while (!dq.isEmpty()&&nums[dq.getLast()]<nums[i])
                dq.removeLast();
            dq.addLast(i);
        }
        for (; i < nums.length; i++) {
            res[j++] =nums[dq.getFirst()];

            while (!dq.isEmpty()&&dq.getFirst()<i-k)
                dq.removeFirst();

            while (!dq.isEmpty()&&nums[dq.getLast()]<nums[i])
                dq.removeLast();

            dq.addLast(i);
        }
        res[j] =nums[dq.getFirst()];
        return res;
    }
}
