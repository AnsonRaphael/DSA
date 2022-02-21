package com.daily;

import java.util.Arrays;
import java.util.Comparator;

public class RemoveCoveredIntervals {
    public static void main(String[] args) {
       // int[][] intervals = {{1,4},{3,6},{2,8}};
        int[][] intervals ={{1,2},{1,4},{3,4}};
        System.out.println(removeCoveredIntervals(intervals));
    }

    public static int removeCoveredIntervals(int[][] intervals) {
        System.out.println(Arrays.deepToString(intervals));
        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[]b){
                int diff= a[0]-b[0];
                if(diff==0){
                    diff=b[1]-a[1];
                }
                return diff;
            }
        });
        System.out.println(Arrays.deepToString(intervals));
        int k=intervals.length;
        int prevEnd=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int currend= intervals[i][1];
            if(currend<=prevEnd){
                k--;
            }
            prevEnd=Math.max(prevEnd,currend);
        }
        return k;
    }
}
