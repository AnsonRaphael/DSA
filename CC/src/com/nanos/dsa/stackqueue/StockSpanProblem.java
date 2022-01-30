package com.nanos.dsa.stackqueue;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {


    public static void main(String[] args) {
        int n = 6;
        int[]price = {10, 4, 5, 90, 120, 80};
        System.out.print(Arrays.toString(calculateSpan(price,n)));
    }
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here

        Stack<Integer> inc = new Stack<>();
        inc.push(0);

        int[] res = new int[n];
        res[0]=1;
        for (int i = 1; i < price.length; i++) {


                while (!inc.isEmpty() && price[inc.peek()]<=price[i]) {
                    inc.pop();
                }

            if(!inc.isEmpty())
            res[i]=i-inc.peek();
            else
            res[i]=i+1;
            inc.push(i);
        }
        return res;
    }
}
