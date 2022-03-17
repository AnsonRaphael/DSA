package com.daily;

import java.util.Stack;

public class ScoreofParentheses {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack= new Stack<>();
        int res=0,prv=0;
        for (int i = 0; i < s.length(); i++) {
            char c= s.charAt(i);
            prv=0;
            if(c=='('){
                stack.push(0);
            }else {
               while (!stack.isEmpty()&&stack.peek()!=0)
                prv+=stack.pop();
                    prv=Math.max(2*prv,1);
                stack.pop();
                stack.push(prv);
            }
        }
        while (!stack.isEmpty())
            res+=stack.pop();
        return res;
    }
}
