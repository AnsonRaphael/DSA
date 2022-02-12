package com.datastructureI;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] frqr=new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            char c=ransomNote.charAt(i);
            frqr[c-'a']++;
        }
        int[] frqm=new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char c=magazine.charAt(i);
            frqm[c-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(frqr[i]>frqm[i])
                return false;
        }
        return true;
    }
}
