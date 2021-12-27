package com.nanos.dsa.recursion;

public class LengthofstringusingRecursion {
    public static void main(String[] args) {
        String str ="GeeksforGeeks";
        System.out.println(recLen(str));
    }

    private static int  recLen(String str) {
        if(str.equals("")){
            return 0;
        }
        return 1+recLen(str.substring(1));
    }
}
