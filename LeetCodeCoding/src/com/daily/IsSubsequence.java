package com.daily;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {

        int f=0;
        if(f==s.length())
            return true;
        char ch=s.charAt(f);
        for(int i=0;i<t.length();i++){
            char ct = t.charAt(i);
            if(ct==ch){
                f++;
                if(f==s.length())
                    return true;
                ch= s.charAt(f);
            }
        }
        return false;
    }
}
