package com.daily;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        s= editor(s);
        t= editor(t);
        return s.equals(t);
    }
    public String editor(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='#'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
