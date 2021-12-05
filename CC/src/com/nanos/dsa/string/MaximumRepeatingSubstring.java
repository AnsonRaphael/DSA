package com.nanos.dsa.string;

public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        String  sequence = "ababc";
        String word = "ab";
        System.out.println(maxRepeating(sequence,word));
    }
    public static int maxRepeating(String sequence, String word) {
        int count =0;
        StringBuilder sb=new StringBuilder(word);
        while(sequence.contains(sb.toString())){
            sb.append(word);
            count++;
        }
        return count;
    }
}
