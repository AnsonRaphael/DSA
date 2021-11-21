package com.nanos.dsa.sorting;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights={1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
        int res=0;
        int[] sr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sr);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=sr[i]){
                res++;
            }
        }
        return res;
    }
}
