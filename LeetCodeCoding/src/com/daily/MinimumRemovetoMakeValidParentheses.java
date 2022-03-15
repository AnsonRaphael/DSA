package com.daily;

import java.util.Stack;

public class MinimumRemovetoMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {

        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int op=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isAlphabetic(c))
                stack.push(c);
            else {
                if(c=='('){
                    op++;
                    stack.push(c);
                }else {
                    if(op==0)
                        continue;
                    else{
                        stack.push(c);
                        op--;
                    }
                }

            }
        }

        while (!stack.isEmpty()){
            char c =stack.pop();
            if(op>0&&c=='('){
                op--;
                continue;
            }
            else {
                res.append(c);

            }
        }
        return res.reverse().toString();
    }
}
