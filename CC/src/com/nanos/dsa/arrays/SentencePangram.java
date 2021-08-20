package com.nanos.dsa.arrays;

public class SentencePangram {
    public static void main(String[] args) {
        String s="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }
    public static boolean checkIfPangram(String sentence) {
        boolean[] pres=new boolean[26];
        //Arrays.fill(pres,false);
        for(int i=0;i<sentence.length();i++){
            int index=sentence.charAt(i)-'a';
            pres[index]=true;
        }
        for(int i=0;i<26;i++){
            if(pres[i]==false){
                return false;
            }
        }
        return true;
    }
}
