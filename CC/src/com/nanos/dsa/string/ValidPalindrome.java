package com.nanos.dsa.string;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome2(s));
    }
    public static boolean isPalindrome(String s) {
        char[] ch=s.toLowerCase().toCharArray();
        int st=0,e=ch.length-1;
        while(st<=e){
            char cst=ch[st];
            char cet=ch[e];
            if((Character.isAlphabetic(cet)||Character.isDigit(cet))&&(Character.isAlphabetic(cst)||Character.isDigit(cst))){
                if(cet!=cst){
                    return false;
                }
                st++;
                e--;
            }else if(!(Character.isAlphabetic(cet)||Character.isDigit(cet))){
                e--;
            }else{
                st++;
            }
        }

        return true;
    }
    public static boolean isPalindrome2(String s) {

        int st=0,e=s.length()-1;
        while(st<=e){
            char cst=s.charAt(st);
            char cet=s.charAt(e);
            if(!isValid(cst)){
                st++;
            }else if(!isValid(cet)){
                e--;
            }else{
                if(toLowerCase(cst)!=toLowerCase(cet)){
                    return false;
                }
                st++;
                e--;
            }

        }

        return true;
    }

    public static boolean isValid(char c){
        if((c>='0'&&c<='9')||(c>='a'&&c<='z')
        ||(c>='A'&&c<='Z')){
            return true;
        }
        return false;
    }
    public static char toLowerCase(char c){
        if((c>='A'&&c<='Z')){
            int of=c-'A';
            return (char) ('a'+of);
        }
        return c;
    }
}
