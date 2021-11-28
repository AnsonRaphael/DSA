package com.nanos.dsa.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums={10,2};
        System.out.println(largestNumber(nums));
    }
    public static String largestNumber(int[] nums) {
        String[] snum = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            snum[i]=String.valueOf(nums[i]);
        }
        Comparator<String> comp= new Comparator<String>(){
            @Override
            public int compare(String s1,String s2){
                String ss1=s1+s2;
                String ss2=s2+s1;
                return ss2.compareTo(ss1);
            }

        };
        Arrays.sort(snum,comp);

        if(snum[0].charAt(0) == '0')
            return "0";
        StringBuilder sb = new StringBuilder();
        for(String s:snum)
            sb.append(s);

        return sb.toString();
    }
}
