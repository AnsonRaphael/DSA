package com.dsa.week.workshop.week3.string.problem;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("The input string is " + str);
        int len = SubsequenceLength(str);
        System.out.println("The length of "
                + "the longest non repeating character is " + len);
    }
    static int SubsequenceLength(String s)
    {
        // Code here
        int le=s.length();
        int [] lastindex=new int[256];
        Arrays.fill(lastindex,-1);
        int res=0,i=0;
        for (int j=0;j<le;j++){

            // if already found i, that will be taken or l
            i=Math.max(i,lastindex[s.charAt(j)]+1);

            res=Math.max(res,j-i+1);

            lastindex[s.charAt(j)]=j;

        }
        return res;
    }
}
