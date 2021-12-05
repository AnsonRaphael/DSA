package com.nanos.dsa.string;

public class ValidPalindromeII {
    public static void main(String[] args) {
        String s="ebcbbececabbacecbbcbe";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {

        int st=0,e=s.length()-1;
        while(st<=e){
            char cst=s.charAt(st);
            char cet=s.charAt(e);
            if(cst!=cet){
                return isPaliandrome(s,st,e-1)||isPaliandrome(s,st+1,e);
            }
            st++;
            e--;
        }
        return true;

    }

    private static boolean isPaliandrome(String s, int st, int e) {
        while(st<=e){
            char cst=s.charAt(st);
            char cet=s.charAt(e);
            if(cst!=cet){
                return false;
            }
            st++;
            e--;
        }
        return true;
    }
}
