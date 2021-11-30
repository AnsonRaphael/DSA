package com.nanos.dsa.string;

public class ShuffleString {
    public static void main(String[] args) {
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
    public static String restoreString(String s, int[] indices) {
        int ln=indices.length;
        char[] ch = new char[ln];
        for(int i=0;i<ch.length;i++){
            ch[indices[i]]=s.charAt(i);
        }
        return new String(ch);
    }
}
