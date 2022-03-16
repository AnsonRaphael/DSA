package com.daily;

import java.util.Stack;

public class ValidateStackSequences {
    public static void main(String[] args) {
       int[] pushed = {1,2,3,4,5}; int[]popped = {4,5,3,2,1};
        System.out.println(validateStackSequences(pushed,popped));

    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {

        int j=0;
        int i = 0;
        Stack<Integer>  stack=new Stack<>();
        for (; j < popped.length;) {
            if(!stack.isEmpty()&&stack.peek()==popped[j]){
                stack.pop();
                j++;
            }else if(i<pushed.length){
               if(pushed[i]!=popped[j]){
                   stack.push(pushed[i]);
                   i++;
               }else {
                   i++;
                   j++;
               }
            }else {
                break;
            }
        }

        return j == popped.length;
    }
}
