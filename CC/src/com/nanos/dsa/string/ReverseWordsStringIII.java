package com.nanos.dsa.string;

public class ReverseWordsStringIII {
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for(String sn:s.split(" ")){
            StringBuilder tem = new StringBuilder(sn);
            sb.append(tem.reverse());
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
