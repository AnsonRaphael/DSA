package com.datastructureI;

public class FirstUniqueCharacterString {
    public int firstUniqChar(String s) {
        int[] frq=new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            frq[c-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(frq[c-'a']<2)
                return i;
        }
        return -1;
    }
}
