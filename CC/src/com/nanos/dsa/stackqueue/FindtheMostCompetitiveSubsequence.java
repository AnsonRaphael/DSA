package com.nanos.dsa.stackqueue;

import java.util.Arrays;
import java.util.Stack;

public class FindtheMostCompetitiveSubsequence {
    public static void main(String[] args) {
        int [] nums = {2,4,3,3,5,4,9,6};
        int k = 4;
        System.out.print(Arrays.toString(nums));
        System.out.print(Arrays.toString(mostCompetitive(nums,k)));
    }

    public static int[] mostCompetitive(int[] nums, int k) {

        Stack<Integer> st = new Stack<>();
        int siz=0;
        for (int i = 0; i < nums.length; i++) {

            while (!st.isEmpty()&&nums[i]<st.peek()&&k-siz+i<nums.length)
            {
                st.pop();
                siz--;
            }
            if(siz<k){
                st.push(nums[i]);
                siz++;
            }
        }
        int[] es=new int[k];
        for (int i = k-1; i >=0 ; i--) {
            es[i]=st.pop();
        }
        return es;
    }
}
