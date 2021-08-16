package com.dsa.week.workshop.week3.string.problem;

public class ReverseWordsGivenString {
    public static void main(String[] args) {
        String  S = "i.like.this.program.very.much";
        System.out.println(reverseWords(S));
    }
    static String reverseWords(String str)
    {
        // code here
        char[] sh=str.toCharArray();
        int prev=0,end=0;
        for (int i=0;i<str.length();i++){
            end=i;
            if(sh[i]=='.'||i== sh.length-1){
                if(i== sh.length-1)
                    end++;
                reverse(sh,prev,end-1);
                prev=++end;
            }

        }

        reverse(sh,0, sh.length-1);
        return new String(sh);
    }

    static void reverse(char[] st,int s,int e){
        while (e>s){
            char c=st[s];
            st[s]=st[e];
            st[e]=c;
            s++;e--;
        }
    }
}
