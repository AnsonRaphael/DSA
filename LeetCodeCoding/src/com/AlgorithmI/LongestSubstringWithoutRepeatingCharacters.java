package com.AlgorithmI;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        char[] str= s.toCharArray();
        int st=0,e=0;
        HashSet<Character> set = new HashSet<>();
        int max=0,sum=0;
        while(st<=e&&e<str.length&&st<str.length){
            if(set.contains(str[e])){
                set.remove(str[st]);
                st++;
            }else{
                set.add(str[e]);
                sum=e-st+1;
                if(max<sum)
                    max=sum;
                e++;
            }
        }
        return max;
    }
}
