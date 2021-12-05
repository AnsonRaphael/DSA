package com.nanos.dsa.string;

public class ReversePrefixWord {
    public static void main(String[] args) {
        String word="abcdefd";
        char ch='d';
        System.out.println(reversePrefix(word,ch));
        System.out.println(reversePrefix2(word,ch));
    }
    public static String reversePrefix(String word, char ch) {
        int index=word.indexOf(""+ch);
        StringBuilder sb = new StringBuilder(word.substring(0,index+1));
        sb.reverse();
        sb.append(word.substring(index+1,word.length()));
        return sb.toString();
    }
    public static String reversePrefix2(String word, char ch) {
        char [] arr = word.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(ch==arr[i]){
                reverse(arr,i);
                break;
            }
        }
        return new String(arr);
    }

    private static void reverse(char[] arr, int i) {
        int s=0;
        while(s<=i){
            char t=arr[s];
            arr[s]=arr[i];
            arr[i]=t;
            s++;
            i--;
        }
    }
}
