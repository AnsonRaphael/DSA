package com.dsa.week.workshop.week3.string.problem;

import java.util.Arrays;

public class CheckStringsRotationsEachOther {
    public static void main(String[] args) {
        String s1=  "geeksforgeeks";
        String s2=  "forgeeksgeeks";
        System.out.println(areRotations1(s1,s2));
        System.out.println(s1+s1);
    }
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        boolean res=false;
        if(s1.length()!=s2.length())
            return false;
        char[] chs1 = s1.toCharArray();
        char c=s1.charAt(0);
        for(int i=0;i<s1.length();i++){
            if(c==s2.charAt(i)){
                char[] chs2 = s2.toCharArray();
                reverse(chs2,0,i-1);

                reverse(chs2,i,s2.length()-1);

                reverse(chs2,0,s2.length()-1);
                //String s=new String(chs2);
                if(Arrays.equals(chs2,chs1))
                    return true;
            }
        }

        return res;
    }
    static void reverse(char[] s,int i,int k){

        while (i<k){
            char c=s[i];
            s[i]=s[k];
            s[k]=c;
            i++;
            k--;
        }

    }
    static boolean areRotations1(String str1, String str2)
    {
        // There lengths must be same and str2 must be
        // a substring of str1 concatenated with str1.
        return (str1.length() == str2.length()) &&
                ((str1 + str1).indexOf(str2) != -1);
    }
}
