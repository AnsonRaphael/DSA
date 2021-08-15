package com.dsa.week.workshop.week3.string.problem;

import java.util.HashMap;

public class MaximumOccuringCharacter {
    public static void main(String[] args) {
        String str = "testsample";
        System.out.println(getMaxOccuringChar(str));
    }
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        HashMap<Character,Integer> freq= new HashMap();
        for (int i=0;i<line.length();i++){
            if(freq.containsKey(line.charAt(i))){
                int k = freq.get(line.charAt(i));
                freq.put(line.charAt(i),++k);
            }else {
                freq.put(line.charAt(i),1);
            }
        }
        char maxch=' ';
        int max=0;
        for(char tem:freq.keySet()){
            int fre=freq.get(tem);
            if(max==fre){
                if((tem+"").compareTo((maxch+""))<0){
                    maxch=tem;

                }
            }
            if(max<fre){
              max=fre;
              maxch=tem;
            }
        }

        return maxch;
    }
}
