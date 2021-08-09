package com.dsa.week.workshop.week3.matrix;

import java.util.Arrays;

public class Anagram {
    static int NO_OF_CHARS = 256;
    public static void main(String[] args) {
        String str1="abcc";
        String str2="cbac";
        System.out.println(isAnagram(str1,str2));

    }
    static boolean isAnagram1(String str1,String str2){
        char[] j = str1.toCharArray();
        Arrays.sort(j);
        String sort1=new String(j);
        char[] j2 = str2.toCharArray();
        Arrays.sort(j2);
        String sort2=new String(j2);

        return sort1.equals(sort2);
    }
    static boolean isAnagram(String str1,String str2){
        boolean flag=true;
        int[] j = new int[NO_OF_CHARS];
        for (int i=0;i<str1.length();i++){
            ++j[str1.charAt(i)-'a'];
        }
        for (int i=0;i<str2.length();i++){
            --j[str2.charAt(i)-'a'];
        }
        if (str1.length() != str2.length())
            return false;
        for (int i=0;i<j.length;i++){
            if (j[i]!=0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
