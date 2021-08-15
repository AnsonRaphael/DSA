package com.dsa.week.workshop.week3.string.problem;

public class MissingCharactersPanagram {
    public static void main(String[] args) {
    String s = "Abcdefghijklmnopqrstuvwxy";
    String b="Abc";
    System.out.println(Solution(s));
    }
    public static String Solution(String str)
    {
        // Find and return the missing characters
        // to complete Panagram string
        String res="";
        //str=str.toLowerCase();
        boolean [] ar= new boolean[26];
        for (int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(a>=65&&a<=90){
                int in=a-'A';
                ar[in]=true;
            }else{
                ar[a-'a']=true;
            }
        }
        for (int i=0;i<26;i++){
            if(ar[i]!=true){
                int tm=i+'a';
                char tl= (char) tm;
                res+=tl;
            }
        }
        if(res.length()==0)
            return "-1";
        return res;
    }
}
