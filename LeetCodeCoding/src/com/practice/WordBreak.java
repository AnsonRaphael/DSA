package com.practice;

import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String>wordDict = List.of("leet","code");
        System.out.println(wordBreak1(s,wordDict));
    }

    public static boolean wordBreak1(String s, List<String> wordDict) {
        if(s==null||s.length()==0)
            return true;
        boolean[] wb= new boolean[s.length()+1];

        for (int i = 1; i <= s.length(); i++) {
            if(wb[i]==false&&wordDict.contains(s.substring(0,i)))
                wb[i]=true;
            
            if(wb[i]==true){
                if(i==s.length())
                    return true;
                for (int j = i+1; j <=s.length() ; j++) {

                    if(wb[j]==false&&wordDict.contains(s.substring(i,j)))
                        wb[j]=true;

                    if(j==s.length()&&wb[j]==true)
                        return true;
                }
            }
        }
        return false;
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        if(s==null||s.length()==0)
            return true;
        for (int i = 1; i <= s.length(); i++) {
            if(wordDict.contains(s.substring(0,i))&&wordBreak(s.substring(i),wordDict))
                return true;
        }
        return false;
    }
}
