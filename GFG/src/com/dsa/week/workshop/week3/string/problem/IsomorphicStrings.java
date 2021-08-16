package com.dsa.week.workshop.week3.string.problem;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String str1 = "pijthbsfy";
        String str2 = "fvladzpbf";
        System.out.println(areIsomorphic(str1,str2));

    }
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        boolean res=false;
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        if(str1.length()!=str2.length())
            return res;

        for (int i=0;i<str1.length();i++){
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            if(map1.containsKey(ch1)){
                if(ch2!=map1.get(ch1)){
                    return res;
                }
            }else{
                map1.put(ch1,ch2);
            }
            if(map2.containsKey(ch2)){
                if(ch1!=map2.get(ch2)){
                    return res;
                }
            }else{
                map2.put(ch2,ch1);
            }
        }

        return true;
    }
    public static boolean areIsomorphic1(String str1,String str2)
    {
        // Your code here
        boolean res=false;
        HashMap<Character,Character> map1 = new HashMap<>();

        if(str1.length()!=str2.length())
            return res;

        for (int i=0;i<str1.length();i++){
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            if(map1.containsKey(ch1)){
                if(ch2!=map1.get(ch1)){
                    return res;
                }
            }else{
                if(map1.containsValue(ch2)){
                    return res;
                }
                map1.put(ch1,ch2);
            }
        }

        return true;
    }
}
