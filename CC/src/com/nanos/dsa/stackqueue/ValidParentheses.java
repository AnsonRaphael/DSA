package com.nanos.dsa.stackqueue;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String  s = "()[]{}";
        System.out.print(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> par= new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c= s.charAt(i);
            if(c==')'||c==']'||c=='}'){
                if(par.isEmpty())
                    return false;
                char po=par.pop();
                if(c==')'&&po!='(')
                    return false;
                if(c==']'&&po!='[')
                    return false;
                if(c=='}'&&po!='{')
                    return false;
            }else {
                par.push(c);
            }
        }
        if(par.empty())
        return true;
        else
            return false;
    }
}
