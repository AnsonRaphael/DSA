package com.nanos.dsa.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strs={"flower","flower","flower"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        int min=strs[0].length();
        String minString=strs[0];
        for(String sn:strs){
            if(sn.length()<min){
                min=sn.length();
                minString=sn;
            }
        }
        int i=0;
        for( i=0;i<min;i++){
            char prev=strs[0].charAt(i);
            for(String sn:strs){
                if(sn.charAt(i)!=prev){
                    return sn.substring(0,i);
                }
            }

        }
        if(strs[0].contains(minString)){
            return minString ;
        }
        return "";
    }
    public static String longestCommonPrefix2(String[] strs) {

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
