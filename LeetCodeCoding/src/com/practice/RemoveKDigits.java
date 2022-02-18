package com.practice;

import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {

    }

    public static String removeKdigits1(String num, int k) {
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<Character>();
        int i=0;

        while(i<num.length()){
            while(k>0&&!stack.isEmpty()&&stack.peek()>num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }

        while(k>0&&!stack.isEmpty()){
            stack.pop();
            k--;
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();

        while(sb.length()>0&&sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }


        return sb.length()==0?"0":sb.toString();
    }

    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder(num);
        while(k>0){
            int i=0;
            while(i<sb.length()-1&&sb.charAt(i)<=sb.charAt(i+1)){
                i++;
            }
            sb.deleteCharAt(i);
            k--;
        }
        while(sb.length()>0&&sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.length()==0?"0":sb.toString();
    }

}
