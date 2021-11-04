package com.nanos.dsa.arrays.searching.binaryleetcode;

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes={35,17,4,24,10};
        int[] bobSizes={63,21};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes,bobSizes)));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int suma=0,sumb=0,exp=0;
        for(int i=0;i<aliceSizes.length;i++){
            suma+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++){
            sumb+=bobSizes[i];
        }
        int [] ans=new int[2];
        Arrays.sort(bobSizes);
        exp=(suma+sumb)/2;
        for(int i=0;i<aliceSizes.length;i++){

            int a=exp-(suma-aliceSizes[i]);
            int b= Arrays.binarySearch(bobSizes,a);
           // System.out.println(aliceSizes[i]+" "+suma+" "+a+" "+b+" ");
           // System.out.println(Arrays.toString(bobSizes));
            if(b>=0){
                ans[0]=aliceSizes[i];
                ans[1]=bobSizes[b];
                return ans;
            }
        }
        return ans;
    }
}
