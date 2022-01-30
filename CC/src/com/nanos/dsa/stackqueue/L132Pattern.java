package com.nanos.dsa.stackqueue;

import java.util.Stack;

public class L132Pattern {
    public static void main(String[] args) {
        int[] nums={3,5,0,3,4};
        System.out.print(find132pattern(nums));
    }

    public static boolean find132pattern(int[] nums) {
        if(nums.length<3)
            return false;
        int[] min = new int[nums.length];
        min[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            min[i]=Math.min(min[i-1],nums[i]);
        }
        Stack<Integer> stack=new Stack<>();
        for (int i = nums.length-1; i >=0 ; i--) {
            if(nums[i]>min[i]){

                while (!stack.isEmpty()&&stack.peek()<=min[i]){
                    stack.pop();
                }
                if(!stack.isEmpty()&&nums[i]>stack.peek()){
                    return true;
                }
                stack.push(nums[i]);
            }
        }
        return false;
    }
}
