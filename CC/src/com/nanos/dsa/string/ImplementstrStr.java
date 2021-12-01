package com.nanos.dsa.string;

public class ImplementstrStr {
    public static void main(String[] args) {
        String haystack="hello"; String needle="ll";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        if (haystack.length() == 0)
            return -1;
        if(needle.length()>haystack.length())
            return -1;

        char [] stk = haystack.toCharArray();
        char [] ndl = needle.toCharArray();
        int start=0;
        for(int i=0;i<=stk.length-ndl.length;i++){
            if(stk[i]==ndl[0]){
                boolean flag=check(stk,ndl,i);
                if(flag){
                    return i;
                }
            }

        }
        return -1;
    }

    public static boolean check(char[] stk,char[] ndl,int i){
        for(int j=0;j<ndl.length;j++){

            if(stk[i+j]!=ndl[j]){
                return false;
            }
        }
        return true;
    }
}
