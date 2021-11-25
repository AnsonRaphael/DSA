package com.nanos.dsa.sorting;

import java.util.Arrays;

public class SortIntegersTheNumber1Bits {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(sortByBits(arr)));
        System.out.println(Arrays.toString(sortByBits2(arr)));
    }

    public static int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (compare2(arr[j], arr[j + 1])) {
                    swap(j, j + 1, arr);
                }
            }
        }
        return arr;
    }

    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    static void swap(int n, int k, int[] arr) {
        int temp = arr[n];
        arr[n] = arr[k];
        arr[k] = temp;
    }

    static boolean compare(int a, int b) {
        boolean flag = true;
        int m = countSetBits(a);
        int n = countSetBits(b);
        if (m == n) {
            if (a > b) {
                return flag;
            } else {
                return !flag;
            }
        }
        if (m > n) {
            return flag;
        } else {
            return !flag;
        }
    }
    static boolean compare2(int a, int b) {
        boolean flag = true;
        int m = Integer.bitCount(a);
        int n = Integer.bitCount(b);
        if (m == n) {
            if (a > b) {
                return flag;
            } else {
                return !flag;
            }
        }
        if (m > n) {
            return flag;
        } else {
            return !flag;
        }
    }
    public static int[] sortByBits2(int[] arr) {
        for (int i=0;i<arr.length;i++){
            arr[i]+=100000*Integer.bitCount(arr[i]);
        }
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            arr[i]=arr[i]%100000;
        }
        return arr;
    }
}
