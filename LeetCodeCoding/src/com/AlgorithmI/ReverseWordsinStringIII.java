package com.AlgorithmI;

public class ReverseWordsinStringIII {
    public String reverseWords(String s) {
        char[]ch=s.toCharArray();
        int st=0,e=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' '){
                reverseString(ch,st,i-1);
                st=i+1;
            }
        }
        reverseString(ch,st,ch.length-1);
        return new String(ch);
    }
    public void reverseString(char[] s,int st,int e) {
        while(st<=e){
            char c=s[st];
            s[st]=s[e];
            s[e]=c;
            st++;
            e--;

        }
    }
}
