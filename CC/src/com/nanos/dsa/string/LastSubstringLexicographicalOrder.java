package com.nanos.dsa.string;

public class LastSubstringLexicographicalOrder {
    public static void main(String[] args) {
        String s="cacacb";
        System.out.println(lastSubstring(s));
    }
    // time limit exceeds compare to
    public static String lastSubstring(String s) {
       String st="";
        for (int i = 0; i <s.length() ; i++) {
            if(st.compareTo(s.substring(i))<0){
               st=s.substring(i);
            }
        }
        return st;
    }
}
