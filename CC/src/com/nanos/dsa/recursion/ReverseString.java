package com.nanos.dsa.recursion;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[]s={'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s) {
            reverseStrings(s,0,s.length-1);
    }
    public static void reverseStrings(char[] s,int st,int e) {
        if(st>e)
            return;
        char tmp =s[st];
        s[st]=s[e];
        s[e]=tmp;
        st++;
        e--;
        reverseStrings(s,st,e);
    }
}
