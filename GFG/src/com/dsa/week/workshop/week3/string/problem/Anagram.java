package com.dsa.week.workshop.week3.string.problem;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String a = "allergy", b = "allergic";
        System.out.println(isAnagram(a,b));
    }
    public static boolean isAnagram(String a,String b)
    {

        // Your code here
        boolean r=true;
        HashMap<Character,Integer> cont= new HashMap<>();
        if(a.length()!=b.length())
            return false;
        for (int i=0;i<a.length();i++){
            if(cont.containsKey(a.charAt(i))){
                int val=cont.get(a.charAt(i));
                cont.put(a.charAt(i),++val);
            }else {
                cont.put(a.charAt(i),1);
            }
        }
        for (int i=0;i<b.length();i++){
            if(cont.containsKey(b.charAt(i))){
                int val=cont.get(b.charAt(i));
                val=val-1;
                cont.put(b.charAt(i),val);
                if(val<0){
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;
    }
}
