package com.nanos.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    public  static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a, b) -> {
            return Integer.compare(a[0],b[0]);
        });
        ArrayList<int[]> res= new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for (int[] va:intervals  ) {
            if(va[0]<=end){
                end=Math.max(va[1],end);
            }else{
                res.add(new int[]{start, end});
                start=va[0];
                end=va[1];
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[0][]);
    }
}
