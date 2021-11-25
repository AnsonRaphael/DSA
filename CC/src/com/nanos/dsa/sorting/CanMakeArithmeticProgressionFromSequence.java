package com.nanos.dsa.sorting;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
        int[] arr={3,5,1};
        System.out.println(canMakeArithmeticProgression(arr));
    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d=arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+d!=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
