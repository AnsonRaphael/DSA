package com.nanos.dsa.string;

public class ShiftingLetters {
    public static void main(String[] args) {
        String s="ruu";
        int[] shifts={26,9,17};
        System.out.println(shiftingLetters(s,shifts));
    }
    public static String shiftingLetters(String s, int[] shifts) {
        char[] ch= s.toCharArray();
        int k=0;
        for(int i=shifts.length-1;i>=0;i--){
            k+=shifts[i];
            k=k%26;
            shifter(ch,i,k);
        }
        return new String(ch);
    }

    public static void shifter(char[] ch,int i,int k){
        if(ch[i]+k>'z'){
            int diff = (ch[i]+k)-'z';
            ch[i]=(char)('a'+diff-1);
        }else{
            ch[i]=(char)(ch[i]+k);
        }

    }

}
