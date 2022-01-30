package com.nanos.dsa.stackqueue;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String  s ="()(()";
        System.out.println(longestValidParentheses(s));
    }
    public static int longestValidParentheses(String s) {
        int maxLen=0,len=0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                st.push(i);
            }else {
                if(!st.isEmpty()){
                    st.pop();

                }if(!st.isEmpty()){
                    maxLen=Math.max(maxLen,i-st.peek());
                } else {
                    st.push(i);
                }
            }
        }
        return maxLen;
    }
}
