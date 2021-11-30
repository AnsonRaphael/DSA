package com.nanos.dsa.string;

public class ToLowerCase {
    public static void main(String[] args) {
        String s="Hello";
        System.out.println(toLowerCase(s));
    }
    public  static String toLowerCase(String s) {
        int ln=s.length();
        StringBuilder sb = new StringBuilder(ln);
        for(int i=0;i<ln;i++){
            char org=s.charAt(i);
            if(org>='A'&&org<='Z'){
                org=(char)('a'+(org-'A'));
            }
            sb.append(org);
        }
        return  sb.toString();
    }
}
