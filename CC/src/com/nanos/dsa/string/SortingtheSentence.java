package com.nanos.dsa.string;

import java.util.Arrays;
import java.util.Comparator;

public class SortingtheSentence {
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
        System.out.println(sortSentence2(s));
    }
    public static String sortSentence(String s) {
        String [] str = s.split(" ");
        Arrays.sort(str, new Comparator<String>(){

            @Override
            public int compare(String s1,String s2){
                int si1=Integer.parseInt(s1.charAt((s1.length()-1))+"");
                int si2=Integer.parseInt(s2.charAt((s2.length()-1))+"");
                return si1-si2;

            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length;i++){
            sb.append(str[i].substring(0,(str[i].length()-1)));
            if(i!=str.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static String sortSentence2(String s) {
        String [] str = s.split(" ");
        String [] ordStr = new String[str.length];
        for(int i=0;i<str.length;i++){
            int index=str[i].charAt(str[i].length()-1)-'0';
            ordStr[index-1]=str[i].substring(0,str[i].length()-1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length;i++){
            sb.append(ordStr[i]);
            if(i!=str.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
