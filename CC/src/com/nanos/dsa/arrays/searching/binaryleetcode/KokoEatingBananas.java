package com.nanos.dsa.arrays.searching.binaryleetcode;

import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles={312884470};
        int h=312884469;
        System.out.println(minEatingSpeed(piles,h));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int l=1,r=piles[piles.length-1],m=0,res=0;
        while (l<=r){
            m=l+(r-l)/2;
            boolean flag = isPossible(piles, m, h);
            System.out.println(l+" "+r+" "+m+" "+flag);
            if(flag){
                r=m-1;
                res=m;
            }else{
                l=m+1;
            }
        }
        return res;
    }

    private static boolean isPossible(int[] piles,int m, int h) {
        int count=0;

        for (int i=0;i<piles.length;i++){
            count+=piles[i]/m;
            if(piles[i]%m!=0)
            count++;
            if(count>h){
                return false;
            }
        }
        System.out.println(count+" "+h);
        return count<=h;
    }
}
