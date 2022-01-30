package com.nanos.dsa.stackqueue;

import java.util.Stack;

public class TheCelebrityProblem {
    public static void main(String[] args) {
        int M[][]={{0 ,1, 0},
                {0, 0, 0},
                {0, 1, 0}};
        int n=3;
        System.out.println(celebrity(M,n));
    }
    static int celebrity(int M[][], int n)
    {
        // code here
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (!st.isEmpty()&&st.size()>1){
            int a= st.pop();
            int b=st.pop();
            if(M[a][b]==1&&M[b][a]==0){
                st.push(b);
            }else {
                st.push(a);
            }
        }
        if(st.isEmpty())
        return -1;
        else{
            int c=st.pop();
            for (int i = 0; i < n; i++) {
                if(i!=c&&(M[c][i]==1||M[i][c]==0)){
                    return -1;
                }
            }
            return c;
        }

    }
}
