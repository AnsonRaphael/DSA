package com.dsa.week.workshop.week3.string.problem;

public class CheckforBinary {
    public static void main(String[] args) {
        String str = "101";
        System.out.println(isBinary(str));
    }
    static boolean isBinary(String str)
    {
        //Your code here
        for (int i=0;i<str.length();i++){
            int a=str.charAt(i)-'0';
            if(!(a==0||a==1)){
                return false;
            }
        }
        return true;
    }
}
