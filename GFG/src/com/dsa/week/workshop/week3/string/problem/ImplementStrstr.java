package com.dsa.week.workshop.week3.string.problem;

public class ImplementStrstr {
    public static void main(String[] args) {
      String  s = "abcabcabcd", x = "abcd";
      System.out.println(strstr(s,x));
    }
    static  int strstr(String s, String x)
    {
        int re=-1;
        // Your code here
        for (int i=0;i<s.length()-x.length()+1;i++){
            int j=0;
            for (j=0;j<x.length();j++){
                if(s.charAt(i+j)!=x.charAt(j)){
                    break;
                }
            }
            if(j==x.length()){
                re=i;
                break;
            }
        }

        return re;
    }
}
