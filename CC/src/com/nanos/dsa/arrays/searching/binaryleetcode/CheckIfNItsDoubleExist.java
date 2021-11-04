package com.nanos.dsa.arrays.searching.binaryleetcode;

import java.util.Arrays;

public class CheckIfNItsDoubleExist {
    public static void main(String[] args) {
        int[] arr={-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){

            int a= Arrays.binarySearch(arr,(2*arr[i]));

            if(a>=0&&a!=i){
                return true;
            }
        }
        return false;
    }
}
