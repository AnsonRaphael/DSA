package com.nanos.dsa.string;
public class CheckBinaryStringHasMostOneSegmentOnes {
    public static void main(String[] args) {
        String s="1001";
        System.out.println(checkOnesSegment(s));
    }
    public static boolean checkOnesSegment(String s) {
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if((s.charAt(i)!=s.charAt(i+1))){
                count++;
            }
        }
        return count<=1;
    }
}
