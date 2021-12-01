package com.nanos.dsa.string;

public class NumberStringsThatAppearSubstringsWord {
    public static void main(String[] args) {
        String[] patterns={"a","abc","bc","d"};
        String word="abc";
        System.out.println(numOfStrings(patterns,word));
    }
    public static int numOfStrings(String[] patterns, String word) {
            int res=0;
            for (int i=0;i<patterns.length;i++){
                if(word.contains(patterns[i])){
                    res++;
                }
            }
            return res;
    }
}
