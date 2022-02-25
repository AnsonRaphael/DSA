package com.practice;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[]temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] res =new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < temperatures.length; i++) {

            while (!st.isEmpty()&&temperatures[st.peek()]<temperatures[i]){
                int j=st.pop();
                res[j]=i-j;

            }
            st.push(i);
        }
        return res;
    }
}
