package com.datastructureI;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] frqr=new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            frqr[c-'a']++;
        }
        int[] frqm=new int[26];
        for (int i = 0; i < t.length(); i++) {
            char c=t.charAt(i);
            frqm[c-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(frqr[i]!=frqm[i])
                return false;
        }
        return true;
    }
}
