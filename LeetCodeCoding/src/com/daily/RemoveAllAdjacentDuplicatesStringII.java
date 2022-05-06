package com.daily;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesStringII {
     static class Pair{
        int count;
        char c;

        public Pair() {
            count=0;
        }

        public Pair(char c) {
            this.count = 1;
            this.c = c;
        }
    }
    public static void main(String[] args) {
        String s = "deeedbbcccbdaa";
        int k = 3;
        System.out.println(removeDuplicates(s,k));
    }
    public static String removeDuplicates(String s, int k) {
        Stack<Pair> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(!st.isEmpty()&&st.peek().c==c){
                if(st.peek().count==k-1){
                    st.pop();
                }else{
                    st.peek().count++;
                }
            }else{
                st.push(new Pair(c));
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            Pair pair = st.pop();
            while (pair.count!=0){
                sb.append(pair.c);
                pair.count--;
            }
        }

        return sb.reverse().toString();
    }
}
