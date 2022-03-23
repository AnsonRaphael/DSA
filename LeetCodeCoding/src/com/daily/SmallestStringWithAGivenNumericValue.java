package com.daily;

import java.util.Arrays;

public class SmallestStringWithAGivenNumericValue {
    public static void main(String[] args) {
        int n=3;
        int k=27;
        System.out.println(getSmallestString(n,k));
    }
    public static String getSmallestString(int n, int k) {
        char res[] = new char[n];
        Arrays.fill(res, 'a');
        k -= n;

        while(k > 0){
            res[--n] += Math.min(25, k);
            k -= Math.min(25, k);
        }
        return String.valueOf(res);
    }
}
