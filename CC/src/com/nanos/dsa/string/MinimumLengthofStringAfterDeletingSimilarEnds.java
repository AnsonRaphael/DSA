package com.nanos.dsa.string;

public class MinimumLengthofStringAfterDeletingSimilarEnds {
    public static void main(String[] args) {
        String s="bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb";
        System.out.println(minimumLength(s));
    }

    public static int minimumLength(String s) {
        int st=0,e=s.length()-1;
        while(st<e){
            char c= s.charAt(st);
            String ss = s.substring(st,e+1);
            if(s.charAt(e)==c){
                while(st<=e&&s.charAt(st)==c) st++;
                while(st<=e&&s.charAt(e)==c) e--;
            }else{
                break;
            }
        }
        if(st<=e){
            return 1+e-st;
        }else{
            return 0;
        }
    }
}
