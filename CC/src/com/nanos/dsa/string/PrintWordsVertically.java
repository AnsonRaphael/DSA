package com.nanos.dsa.string;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically {
    public static void main(String[] args) {
        String s="TO BE OR NOT TO BE";
        System.out.println(printVertically(s));
    }
    public static List<String> printVertically(String s) {
        List<String> res= new ArrayList<>();
        String[] words=s.split(" ");
        int maxlen=0;
        for (int i = 0; i < words.length; i++) {
            if(maxlen<words[i].length())
                maxlen=words[i].length();
        }
        for (int i = 0; i < maxlen; i++) {
            StringBuilder trnwrd= new StringBuilder();
            int del=0;
            for (int j = 0; j < words.length; j++) {
                if(i<words[j].length()){
                    trnwrd.append(words[j].charAt(i));
                    del=j;
                }else{
                    trnwrd.append(" ");
                }
            }
            res.add(trnwrd.substring(0,del+1));
        }
        return res;
    }
}
