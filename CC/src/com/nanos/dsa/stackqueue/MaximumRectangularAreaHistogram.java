package com.nanos.dsa.stackqueue;

import java.util.Arrays;
import java.util.Stack;

public class MaximumRectangularAreaHistogram {
    public static void main(String[] args) {
        long hist[]={6,2,5,4,5,1,6};
        long n=7;
        System.out.println(getMaxArea(hist,n));
    }
    public static long getMaxArea(long hist[], long n)
    {
        // your code here
        Stack<Integer> st= new Stack<>();
        Stack<Long> stv= new Stack<>();
        int tp=0;
        long maxArea=0;
        long areaAsTop=0;
        int i=0;
        while (i<n){
        System.out.println("Array "+ Arrays.toString(hist));
        System.out.println("StackV "+ stv+" hst[i] "+hist[i]);
        System.out.println("Stack "+ st +" i "+i+" areaAsTop "+areaAsTop+" maxArea "+maxArea);
            // push if stack empty or peak smaller than current
            if(st.isEmpty()||hist[st.peek()] <= hist[i]){
                stv.push(hist[i]);
                st.push(i++);

            }

            else {
                tp= st.peek();
                st.pop();
                stv.pop();
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

//    public static long getMaxArea1(long hist[], long n)
//    {
//       // System.out.println(Arrays.toString(hist));
//        // your code here
//        Stack<Integer> st= new Stack<>();
//        int [] lb= new int[(int)n];
//        int [] rb= new int[(int)n];
//        st.push(-1);
//        lb[0]=-1;
//        // fill left limit
//        for (int i = 1; i < n; i++) {
//            if(st.isEmpty()||st.peek()==-1||hist[st.peek()]<hist[i]){
//                lb[i]=st.peek();
//                st.push(i);
//            }else{
//                while (!st.isEmpty()&&st.peek()!=-1&&hist[st.peek()]>hist[i])
//                    st.pop();
//                if(st.isEmpty())
//                    lb[i]=-1;
//                else
//                    lb[i]=st.peek();
//                st.push(i);
//            }
//        }
//        System.out.println(Arrays.toString(lb));
//        st.clear();
//        st.push(lb.length);
//        rb[lb.length-1]=lb.length;
//        // fill left limit
//        for (int i = lb.length-2; i >=0; i--) {
//            if(st.isEmpty()||st.peek()==lb.length||hist[st.peek()]<hist[i]){
//                rb[i]=st.peek();
//                st.push(i);
//            }else{
//                while (!st.isEmpty()&&st.peek()!=lb.length&&hist[st.peek()]>hist[i])
//                    st.pop();
//                if(st.isEmpty())
//                    rb[i]=lb.length;
//                else
//                    rb[i]=st.peek()-1;
//                st.push(i);
//            }
//        }
//        System.out.println(Arrays.toString(rb));
//        long maxArea=0;
////        int rb1[]= {1,4,3,4,5,6,6};
////        int lb1[]= {0,0,1,1,3,0,5};
//        int i=0;
//        while (i<n){
//          int area= (int) (hist[i]*(rb[i]-lb[i]-1));
//            System.out.print(area+" ");
//          if(maxArea<area)
//            maxArea=area;
//          i++;
//        }
//        System.out.println();
//        return maxArea;
//    }
}
