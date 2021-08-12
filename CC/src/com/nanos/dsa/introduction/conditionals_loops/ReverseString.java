package com.nanos.dsa.introduction.conditionals_loops;

public class ReverseString {
    public static void main(String[] args) {
        String str ="Helloo im";
        System.out.println(reverse(str));
    }

    static String reverse(String str) {

        char[] arr = str.toCharArray();
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            char c = arr[l];
            arr[l] = arr[r];
            arr[r] = c;
            l++;
            r--;
        }
        return new String(arr);
    }
}