package com.AlgorithmI;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {
        String s = "C";
        System.out.println(letterCasePermutation(s));
    }
    public static List<String> letterCasePermutation(String s) {
        if(s==null)
            return new ArrayList<>();
        List<String> res= new ArrayList<>();
        char[] charray=s.toCharArray();
        letterCasePermutation2(res,charray,0);
        return res;
    }

    private static void letterCasePermutation2(List<String> res, char[] charray, int i) {
        if(charray.length==i){
            res.add(new String(charray));
            return;
        }


        char c= charray[i];

        if(Character.isAlphabetic(c)){
            letterCasePermutation2(res,charray,i+1);
            if(Character.isLowerCase(c)){
                char cn = Character.toUpperCase(c);
                charray[i]=cn;
                letterCasePermutation2(res,charray,i+1);
                charray[i]=c;
            }else{
                char cn = Character.toLowerCase(c);
                charray[i]=cn;
                letterCasePermutation2(res,charray,i+1);
                charray[i]=c;
            }
        }else{
            letterCasePermutation2(res,charray,i+1);
        }

    }
}
