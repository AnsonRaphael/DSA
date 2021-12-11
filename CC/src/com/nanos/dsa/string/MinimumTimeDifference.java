package com.nanos.dsa.string;

import java.util.Arrays;
import java.util.List;

public class MinimumTimeDifference {
    public static void main(String[] args) {
        List<String> timePoints = Arrays.asList("05:31","22:08","00:35");
        System.out.println(findMinDifference(timePoints));
        System.out.println(findMinDifference1(timePoints));
    }
    public static int findMinDifference(List<String> timePoints) {
        int[] mint= new int[timePoints.size()];
        for(int i=0;i<timePoints.size();i++){
            mint[i]=convert(timePoints.get(i));
        }
        int res=Integer.MAX_VALUE;
        Arrays.sort(mint);
        for(int i=0;i<mint.length-1;i++){
            int diff1=Math.abs(mint[i+1]-mint[i]);
            int diff2=Math.abs(mint[i]-mint[i+1]+(24*60));
            int diff= Math.min(diff1,diff2);
            if(res>diff)
                res=diff;
        }
        int diff1=Math.abs(mint[mint.length-1]-mint[0]);
        int diff2=Math.abs(mint[0]-mint[mint.length-1]+(24*60));
        int diff= Math.min(diff1,diff2);
        if(res>diff)
            res=diff;

        return res;
    }
    public static int convert(String s){
        String[] hm=s.split(":");
        int hh=Integer.parseInt(hm[0]);
        int mm=Integer.parseInt(hm[1]);
        int res=(hh*60)+mm;
        if(res==0)
            return 24*60;
        return res;
    }

    public static int findMinDifference1(List<String> timePoints) {
        int[] arr=new int[60*24];
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int i=0;i<timePoints.size();i++){
            String timeS=timePoints.get(i);
            int time = Integer.parseInt(timeS.substring(0,2))*60+
                    Integer.parseInt(timeS.substring(3));
            // set min and max times
            if(time<min){
                min=time;
            }
            if(time>max){
                max=time;
            }
            // if that time found again then difference is 0
            if(arr[time]==1){
                return 0;
            }
            // mark found that time
            arr[time]=1;
        }
        // calculate possible min time by going over 24 hr clock to 00hr
        int diff=(60*24-max)+min;
        int curr=Integer.MIN_VALUE;
        // check difference between adjacent times and possible solution
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                if(curr!=Integer.MIN_VALUE){
                    diff=Math.min(diff,i-curr);
                }
                curr=i;
            }
        }

        return diff;
    }
}
