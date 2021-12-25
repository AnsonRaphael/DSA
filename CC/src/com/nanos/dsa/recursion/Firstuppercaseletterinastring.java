package com.nanos.dsa.recursion;

public class Firstuppercaseletterinastring {
    public static void main(String[] args) {
        String str = "geeksforGeeKS";
        char res = first(str,0);
        if (res == 0)
            System.out.println("No uppercase letter");
        else
            System.out.println (res );
    }

    private static char first(String str, int i) {
        if(str.length()==i)
            return '0';
        if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
            return str.charAt(i);
        }
        return first(str,i+1);
    }
}
