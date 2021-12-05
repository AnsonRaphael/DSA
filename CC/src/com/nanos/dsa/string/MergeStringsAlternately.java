package com.nanos.dsa.string;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1="abc";
        String word2="pqr";
        System.out.println(mergeAlternately(word1,word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        int i=0,j=0,k=0;
        StringBuilder sb= new StringBuilder();
        while(i<word1.length()&&j<word2.length()){
            if(k%2==0){
                sb.append(word1.charAt(i));
                i++;
            }else{
                sb.append(word2.charAt(j));
                j++;
            }
            k++;
        }
        while(i<word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();
    }
}
