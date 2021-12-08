package com.nanos.dsa.string;

public class SwapAdjacentLRString {
    public static void main(String[] args) {
        String start="RXXLRXRXL";
        String end="XRLXXRRLX";
        System.out.println(canTransform(start,end));
    }
    public static boolean canTransform(String start, String end) {
        if(!start.replace("X","").equals(end.replace("X",""))){
            return false;
        }
        int i=0,j=0;
        while(i<start.length()&&j<end.length()){
            while(i<start.length() && start.charAt(i)=='X') i++;
            while(j<end.length() && end.charAt(j)=='X') j++;
            if(i==start.length()&&j==end.length())
                return true;
            while(start.charAt(i)=='R'&&i>j) return false;
            while(start.charAt(i)=='L'&&i<j) return false;
            i++;
            j++;
        }
        return true;
    }
}
