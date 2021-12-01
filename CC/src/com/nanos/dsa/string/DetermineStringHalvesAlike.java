package com.nanos.dsa.string;

public class DetermineStringHalvesAlike {
    public static void main(String[] args) {
        String s="book";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
        int av=0,bv=0;
        int ln=s.length();
        for(int i=0;i<ln;i++){
            char c= s.charAt(i);
            if(isVowel(c)){
                if(i<ln/2){
                    av++;
                }else{
                    bv++;
                }
            }

        }
        if(av==bv){
            return true;
        }else{
            return false;
        }

    }
    public static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }else{
            return false;
        }
    }
}
