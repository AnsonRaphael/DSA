package com.nanos.dsa.stackqueue;

import java.util.Stack;

public class MaxRectangle {
    public static void main(String[] args) {
        int M[][] = {{0 ,1, 1 ,0},
            {1, 1 ,1 ,1},
            {1 ,1 ,1 ,1},
            {1 ,1, 0 ,0}};
        int n=4;
        int m=4;
        System.out.println(maxArea(M,n,m));
    }
    public static int maxArea(int M[][], int n, int m) {
        // add code here.
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(M[i][j]!=0){
                    M[i][j]=M[i][j]+M[i-1][j];
                }
            }
        }

        int max_ans=0;
        for (int i = 0; i < n; i++) {
            int val=getMaxArea(M[i],m);
            if(val>max_ans)
                max_ans=val;
        }


        return max_ans;
    }

    public static int getMaxArea(int hist[], int n)
    {
        // your code here
        Stack<Integer> st= new Stack<>();
        int tp=0;
        int maxArea=0;
        int areaAsTop=0;
        int i=0;
        while (i<n){

            // push if stack empty or peak smaller than current
            if(st.isEmpty()||hist[st.peek()] <= hist[i])
                st.push(i++);
            else {
                tp= st.peek();
                st.pop();
                areaAsTop=hist[tp]*(st.isEmpty()?i:i-st.peek()-1);

                if(maxArea<areaAsTop)
                    maxArea=areaAsTop;
            }

        }

        while (!st.isEmpty()){
            tp= st.peek();
            st.pop();
            areaAsTop=hist[tp]*(st.isEmpty()?i:i-st.peek()-1);

            if(maxArea<areaAsTop)
                maxArea=areaAsTop;
        }

        return maxArea;
    }
}
