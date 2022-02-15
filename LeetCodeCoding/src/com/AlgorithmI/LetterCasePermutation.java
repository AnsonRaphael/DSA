package com.AlgorithmI;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {
        String s = "a1b2";
        System.out.println(letterCasePermutation(s));
    }
    public static List<String> letterCasePermutation(String s) {
        if(s==null)
            return new ArrayList<>();
        List<String> res= new ArrayList<>();
        char[] charray=s.toCharArray();
        letterCasePermutation1(res,new StringBuilder(),s,0);
        return res;
    }
    public static void letterCasePermutation1(List<String> res,StringBuilder processed,String s,int i) {
        if(s.length()==processed.length())
            res.add(new String(processed.toString()));

        for (int j = i; j < s.length(); j++) {
            char c=s.charAt(j);
            processed.append(c);
            if(Character.isAlphabetic(c)){
                letterCasePermutation1(res,processed,s,j+1);
                if(Character.isLowerCase(c)){
                    c= Character.toUpperCase(c);
                }else{
                    c=Character.toUpperCase(c);
                }
                processed.deleteCharAt(j);
                processed.append(c);
                letterCasePermutation1(res,processed,s,j+1);
            }else{
                letterCasePermutation1(res,processed,s,j+1);
            }

        }

    }
}
